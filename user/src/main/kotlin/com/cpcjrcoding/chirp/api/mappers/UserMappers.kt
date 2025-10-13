package com.cpcjrcoding.chirp.api.mappers

import com.cpcjrcoding.chirp.api.dto.AuthenticatedUserDto
import com.cpcjrcoding.chirp.api.dto.UserDto
import com.cpcjrcoding.chirp.domain.model.AuthenticatedUser
import com.cpcjrcoding.chirp.domain.model.User

fun AuthenticatedUser.toAuthenticatedUserDto(): AuthenticatedUserDto =
    AuthenticatedUserDto(
        user = user.toUserDto(),
        accessToken = accessToken,
        refreshToken = refreshToken,
    )

fun User.toUserDto(): UserDto =
    UserDto(
        id = id,
        email = email,
        username = username,
        hasVerifiedEmail = hasEmailVerified,
    )
