package com.cpcjrcoding.chirp.domain.model

import com.cpcjrcoding.chirp.domain.type.UserId

data class User(
    val id: UserId,
    val username: String,
    val email: String,
    val hasEmailVerified: Boolean,
)
