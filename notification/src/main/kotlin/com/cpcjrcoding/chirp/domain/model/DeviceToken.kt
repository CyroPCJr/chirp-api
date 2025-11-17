package com.cpcjrcoding.chirp.domain.model

import com.cpcjrcoding.chirp.domain.type.UserId
import java.time.Instant

data class DeviceToken(
    val id: Long,
    val userId: UserId,
    val token: String,
    val platform: Platform,
    val createdAt: Instant = Instant.now(),
) {
    enum class Platform {
        ANDROID,
        IOS,
    }
}
