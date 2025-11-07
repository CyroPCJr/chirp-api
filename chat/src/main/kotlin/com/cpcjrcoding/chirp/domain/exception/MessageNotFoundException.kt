package com.cpcjrcoding.chirp.domain.exception

import com.cpcjrcoding.chirp.domain.type.ChatMessageId

class MessageNotFoundException(
    private val id: ChatMessageId,
) : RuntimeException(
        "Message with ID $id not found",
    )
