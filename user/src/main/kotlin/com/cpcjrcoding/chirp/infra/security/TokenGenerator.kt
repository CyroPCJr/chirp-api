package com.cpcjrcoding.chirp.infra.security

import java.security.SecureRandom
import java.util.Base64

object TokenGenerator {
    const val MAX_BYTE_ARRAY = 32

    fun generateSecureToken(): String {
        val bytes = ByteArray(MAX_BYTE_ARRAY) { 0 }

        val secureRandom = SecureRandom()
        secureRandom.nextBytes(bytes)

        return Base64
            .getUrlEncoder()
            .withoutPadding()
            .encodeToString(bytes)
    }
}
