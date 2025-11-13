package com.cpcjrcoding.chirp.api.dto.ws

import com.cpcjrcoding.chirp.domain.type.UserId

data class ProfilePictureUpdateDto(
    val userId: UserId,
    val newUrl: String?,
)
