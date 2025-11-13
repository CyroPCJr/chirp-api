package com.cpcjrcoding.chirp.api.mappers

import com.cpcjrcoding.chirp.api.dto.ChatDto
import com.cpcjrcoding.chirp.api.dto.ChatMessageDto
import com.cpcjrcoding.chirp.api.dto.ChatParticipantDto
import com.cpcjrcoding.chirp.domain.models.Chat
import com.cpcjrcoding.chirp.domain.models.ChatMessage
import com.cpcjrcoding.chirp.domain.models.ChatParticipant

fun Chat.toChatDto(): ChatDto =
    ChatDto(
        id = id,
        participants =
            participants.map {
                it.toChatParticipantDto()
            },
        lastActivityAt = lastActivityAt,
        lastMessage = lastMessage?.toChatMessageDto(),
        creator = creator.toChatParticipantDto(),
    )

fun ChatMessage.toChatMessageDto(): ChatMessageDto =
    ChatMessageDto(
        id = id,
        chatId = chatId,
        content = content,
        createdAt = createdAt,
        senderId = sender.userId,
    )

fun ChatParticipant.toChatParticipantDto(): ChatParticipantDto =
    ChatParticipantDto(
        userId = userId,
        username = username,
        email = email,
        profilePictureUrl = profilePictureUrl,
    )
