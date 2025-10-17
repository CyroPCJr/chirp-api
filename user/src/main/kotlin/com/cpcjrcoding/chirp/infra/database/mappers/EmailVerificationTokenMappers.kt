package com.cpcjrcoding.chirp.infra.database.mappers

import com.cpcjrcoding.chirp.domain.model.EmailVerificationToken
import com.cpcjrcoding.chirp.infra.database.entities.EmailVerificationTokenEntity

fun EmailVerificationTokenEntity.toEmailVerificationToken(): EmailVerificationToken =
    EmailVerificationToken(
        id = id,
        token = token,
        user = user.toUser(),
    )
