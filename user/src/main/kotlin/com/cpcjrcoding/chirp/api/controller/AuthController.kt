package com.cpcjrcoding.chirp.api.controller

import com.cpcjrcoding.chirp.api.dto.AuthenticatedUserDto
import com.cpcjrcoding.chirp.api.dto.LoginRequest
import com.cpcjrcoding.chirp.api.dto.RefreshRequest
import com.cpcjrcoding.chirp.api.dto.RegisterRequest
import com.cpcjrcoding.chirp.api.dto.UserDto
import com.cpcjrcoding.chirp.api.mappers.toAuthenticatedUserDto
import com.cpcjrcoding.chirp.api.mappers.toUserDto
import com.cpcjrcoding.chirp.service.auth.AuthService
import com.cpcjrcoding.chirp.service.auth.EmailVerificationService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/auth")
class AuthController(
    private val authService: AuthService,
    private val emailVerificationService: EmailVerificationService,
) {
    @PostMapping("/register")
    fun register(
        @Valid @RequestBody body: RegisterRequest,
    ): UserDto =
        authService
            .register(
                email = body.email,
                username = body.username,
                password = body.password,
            ).toUserDto()

    @PostMapping("/login")
    fun login(
        @RequestBody body: LoginRequest,
    ): AuthenticatedUserDto =
        authService
            .login(
                email = body.email,
                password = body.password,
            ).toAuthenticatedUserDto()

    @PostMapping("/refresh")
    fun refresh(
        @RequestBody body: RefreshRequest,
    ): AuthenticatedUserDto =
        authService
            .refresh(body.refreshToken)
            .toAuthenticatedUserDto()

    @PostMapping("/logout")
    fun logout(
        @RequestBody body: RefreshRequest,
    ) {
        authService.logout(body.refreshToken)
    }

    @GetMapping("/verify")
    fun verifyEmail(
        @RequestParam token: String,
    ) {
        emailVerificationService.verifyEmail(token)
    }
}
