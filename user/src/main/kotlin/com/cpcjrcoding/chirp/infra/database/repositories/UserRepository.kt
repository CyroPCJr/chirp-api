package com.cpcjrcoding.chirp.infra.database.repositories

import com.cpcjrcoding.chirp.domain.model.UserId
import com.cpcjrcoding.chirp.infra.database.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, UserId> {
    fun findByEmail(email: String): UserEntity?

    fun findByEmailOrUsername(
        email: String,
        username: String,
    ): UserEntity?
}
