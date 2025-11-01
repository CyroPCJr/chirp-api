package com.cpcjrcoding.chirp.infra.database.repositories

import com.cpcjrcoding.chirp.domain.type.UserId
import com.cpcjrcoding.chirp.infra.database.entities.RefreshTokenEntity
import org.springframework.data.jpa.repository.JpaRepository

interface RefreshTokenRepository : JpaRepository<RefreshTokenEntity, Long> {
    fun findByUserIdAndHashedToken(
        userId: UserId,
        hashedToken: String,
    ): RefreshTokenEntity?

    fun deleteByUserIdAndHashedToken(
        userId: UserId,
        hashedToken: String,
    )

    fun deleteByUserId(userId: UserId)
}
