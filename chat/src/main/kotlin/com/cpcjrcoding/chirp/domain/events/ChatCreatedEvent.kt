package com.cpcjrcoding.chirp.domain.events

import com.cpcjrcoding.chirp.domain.type.ChatId
import com.cpcjrcoding.chirp.domain.type.UserId

data class ChatCreatedEvent(
    val chatId: ChatId,
    val participantIds: List<UserId>,
)
