package com.cpcjrcoding.chirp

import com.cpcjrcoding.chirp.infra.database.entities.UserEntity
import com.cpcjrcoding.chirp.infra.database.repositories.UserRepository
import jakarta.annotation.PostConstruct
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class ChirpApplication

fun main(args: Array<String>) {
    runApplication<ChirpApplication>(*args)
}

@Component
class Demo(
    private val repo: UserRepository,
) {
    @PostConstruct
    fun init() {
        repo.save(
            UserEntity(
                email = "Test@test.com",
                hashedPassword = "asd",
                hasVerifiedEmail = true,
                username = "test",
            ),
        )
    }
}
