package com.cpcjrcoding.chirp.domain.models

import com.cpcjrcoding.chirp.domain.type.UserId

data class ChatParticipant(
    val userId: UserId,
    val username: String,
    val email: String,
    val profilePictureUrl: String?,
)
