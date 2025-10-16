package com.cpcjrcoding.chirp.api.controller

import com.cpcjrcoding.chirp.api.dto.AuthenticatedUserDto
import com.cpcjrcoding.chirp.api.dto.LoginRequest
import com.cpcjrcoding.chirp.api.dto.RegisterRequest
import com.cpcjrcoding.chirp.api.dto.UserDto
import com.cpcjrcoding.chirp.api.mappers.toAuthenticatedUserDto
import com.cpcjrcoding.chirp.api.mappers.toUserDto
import com.cpcjrcoding.chirp.service.auth.AuthService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/auth")
class AuthController(
    private val authService: AuthService,
) {
    @PostMapping("/register")
    fun register(
        @Valid @RequestBody body: RegisterRequest,
    ): UserDto =
        authService
            .register(
                email = body.email,
                username = body.username,
                password = body.password,
            ).toUserDto()

    @PostMapping("/login")
    fun login(
        @RequestBody body: LoginRequest,
    ): AuthenticatedUserDto =
        authService
            .login(
                email = body.email,
                password = body.password,
            ).toAuthenticatedUserDto()
}
