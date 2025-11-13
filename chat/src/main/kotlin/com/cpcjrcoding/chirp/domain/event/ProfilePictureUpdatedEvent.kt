package com.cpcjrcoding.chirp.domain.event

import com.cpcjrcoding.chirp.domain.type.UserId

class ProfilePictureUpdatedEvent(
    val userId: UserId,
    val newUrl: String?,
)
