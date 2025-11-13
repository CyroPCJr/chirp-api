package com.cpcjrcoding.chirp.api.dto.ws

import com.cpcjrcoding.chirp.domain.type.ChatId
import com.cpcjrcoding.chirp.domain.type.ChatMessageId

data class DeleteMessageDto(
    val chatId: ChatId,
    val messageId: ChatMessageId,
)
