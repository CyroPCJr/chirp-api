package com.cpcjrcoding.chirp.api.dto

import com.cpcjrcoding.chirp.domain.type.UserId

data class ChatParticipantDto(
    val userId: UserId,
    val username: String,
    val email: String,
    val profilePictureUrl: String?,
)
