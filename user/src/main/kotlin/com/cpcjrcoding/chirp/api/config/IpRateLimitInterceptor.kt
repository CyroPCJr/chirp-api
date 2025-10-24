package com.cpcjrcoding.chirp.api.config

import com.cpcjrcoding.chirp.domain.exception.RateLimitException
import com.cpcjrcoding.chirp.infra.ratelimiting.IpRateLimiter
import com.cpcjrcoding.chirp.infra.ratelimiting.IpResolver
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.web.method.HandlerMethod
import org.springframework.web.servlet.HandlerInterceptor
import java.time.Duration
import kotlin.jvm.java

@Component
class IpRateLimitInterceptor(
    private val ipRateLimiter: IpRateLimiter,
    private val ipResolver: IpResolver,
    @param:Value($$"${chirp.rate-limit.ip.apply-limit}") private val applyLimit: Boolean,
) : HandlerInterceptor {
    override fun preHandle(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
    ): Boolean {
        if (handler is HandlerMethod && applyLimit) {
            val annotation = handler.getMethodAnnotation(IpRateLimit::class.java)
            if (annotation != null) {
                val clientIp = ipResolver.getClientIp(request)

                return try {
                    ipRateLimiter.withIpRateLimit(
                        ipAddress = clientIp,
                        resetsIn =
                            Duration.of(
                                annotation.duration,
                                annotation.unit.toChronoUnit(),
                            ),
                        maxRequestsPerIp = annotation.requests,
                        action = { true },
                    )
                } catch (e: RateLimitException) {
                    response.sendError(HttpStatus.TOO_MANY_REQUESTS.toString().toInt())
                    false
                }
            }
        }

        return true
    }
}
