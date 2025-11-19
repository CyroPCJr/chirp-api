package com.cpcjrcoding.chirp.infra.mappers

import com.cpcjrcoding.chirp.domain.model.DeviceToken
import com.cpcjrcoding.chirp.infra.database.DeviceTokenEntity

fun DeviceTokenEntity.toDeviceToken(): DeviceToken =
    DeviceToken(
        userId = userId,
        token = token,
        platform = platform.toPlatform(),
        createdAt = createdAt,
        id = id,
    )
