package com.cpcjrcoding.chirp.api.dto

import com.cpcjrcoding.chirp.domain.type.ChatId
import com.cpcjrcoding.chirp.domain.type.ChatMessageId
import com.cpcjrcoding.chirp.domain.type.UserId
import java.time.Instant

data class ChatMessageDto(
    val id: ChatMessageId,
    val chatId: ChatId,
    val content: String,
    val createdAt: Instant,
    val senderId: UserId,
)
