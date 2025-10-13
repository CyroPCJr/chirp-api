package com.cpcjrcoding.chirp.api.dto

import com.cpcjrcoding.chirp.domain.model.UserId

data class UserDto(
    val id: UserId,
    val email: String,
    val username: String,
    val hasVerifiedEmail: Boolean,
)
