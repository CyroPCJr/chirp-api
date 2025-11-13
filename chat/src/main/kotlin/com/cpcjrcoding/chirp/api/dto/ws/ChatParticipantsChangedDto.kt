package com.cpcjrcoding.chirp.api.dto.ws

import com.cpcjrcoding.chirp.domain.type.ChatId

data class ChatParticipantsChangedDto(
    val chatId: ChatId,
)
