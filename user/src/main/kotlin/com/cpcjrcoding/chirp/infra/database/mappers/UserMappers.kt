package com.cpcjrcoding.chirp.infra.database.mappers

import com.cpcjrcoding.chirp.domain.model.User
import com.cpcjrcoding.chirp.infra.database.entities.UserEntity

fun UserEntity.toUser(): User =
    User(
        id = id!!,
        username = username,
        email = email,
        hasEmailVerified = hasVerifiedEmail,
    )
