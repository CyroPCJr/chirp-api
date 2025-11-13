package com.cpcjrcoding.chirp.api.mappers

import com.cpcjrcoding.chirp.api.dto.PictureUploadResponse
import com.cpcjrcoding.chirp.domain.models.ProfilePictureUploadCredentials

fun ProfilePictureUploadCredentials.toResponse(): PictureUploadResponse =
    PictureUploadResponse(
        uploadUrl = uploadUrl,
        publicUrl = publicUrl,
        headers = headers,
        expiresAt = expiresAt,
    )
