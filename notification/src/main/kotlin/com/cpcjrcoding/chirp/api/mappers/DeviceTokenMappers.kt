package com.cpcjrcoding.chirp.api.mappers

import com.cpcjrcoding.chirp.api.dto.DeviceTokenDto
import com.cpcjrcoding.chirp.api.dto.PlatformDto
import com.cpcjrcoding.chirp.domain.model.DeviceToken

fun DeviceToken.toDeviceTokenDto(): DeviceTokenDto =
    DeviceTokenDto(
        userId = userId,
        token = token,
        createdAt = createdAt,
    )

fun PlatformDto.toPlatformDto(): DeviceToken.Platform =
    when (this) {
        PlatformDto.ANDROID -> DeviceToken.Platform.ANDROID
        PlatformDto.IOS -> DeviceToken.Platform.IOS
    }
