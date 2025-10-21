package com.cpcjrcoding.chirp.api.dto

import com.cpcjrcoding.chirp.api.util.Password
import jakarta.validation.constraints.NotBlank

data class ResetPasswordRequest(
    @field:NotBlank
    val token: String,
    @field:Password
    val newPassword: String,
)
