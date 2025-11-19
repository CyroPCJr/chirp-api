package com.cpcjrcoding.chirp.infra.mappers

import com.cpcjrcoding.chirp.domain.model.DeviceToken
import com.cpcjrcoding.chirp.infra.database.PlatformEntity

fun DeviceToken.Platform.toPlatformEntity(): PlatformEntity =
    when (this) {
        DeviceToken.Platform.ANDROID -> PlatformEntity.ANDROID
        DeviceToken.Platform.IOS -> PlatformEntity.IOS
    }

fun PlatformEntity.toPlatform(): DeviceToken.Platform =
    when (this) {
        PlatformEntity.ANDROID -> DeviceToken.Platform.ANDROID
        PlatformEntity.IOS -> DeviceToken.Platform.IOS
    }
