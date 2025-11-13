package com.cpcjrcoding.chirp.domain.events

import com.cpcjrcoding.chirp.domain.type.UserId

class ProfilePictureUpdatedEvent(
    val userId: UserId,
    val newUrl: String?,
)
