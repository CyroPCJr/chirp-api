package com.cpcjrcoding.chirp.infra.database.mappers

import com.cpcjrcoding.chirp.domain.models.Chat
import com.cpcjrcoding.chirp.domain.models.ChatMessage
import com.cpcjrcoding.chirp.domain.models.ChatParticipant
import com.cpcjrcoding.chirp.infra.database.entities.ChatEntity
import com.cpcjrcoding.chirp.infra.database.entities.ChatMessageEntity
import com.cpcjrcoding.chirp.infra.database.entities.ChatParticipantEntity

fun ChatEntity.toChat(lastMessage: ChatMessage? = null): Chat =
    Chat(
        id = id!!,
        participants =
            participants
                .map {
                    it.toChatParticipant()
                }.toSet(),
        creator = creator.toChatParticipant(),
        lastActivityAt = lastMessage?.createdAt ?: createdAt,
        createdAt = createdAt,
        lastMessage = lastMessage,
    )

fun ChatParticipantEntity.toChatParticipant(): ChatParticipant =
    ChatParticipant(
        userId = userId,
        username = username,
        email = email,
        profilePictureUrl = profilePictureUrl,
    )

fun ChatParticipant.toChatParticipantEntity(): ChatParticipantEntity =
    ChatParticipantEntity(
        userId = userId,
        username = username,
        email = email,
        profilePictureUrl = profilePictureUrl,
    )

fun ChatMessageEntity.toChatMessage(): ChatMessage =
    ChatMessage(
        id = id!!,
        chatId = chatId,
        sender = sender.toChatParticipant(),
        content = content,
        createdAt = createdAt,
    )
