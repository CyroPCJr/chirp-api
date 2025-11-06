package com.cpcjrcoding.chirp.service

import com.cpcjrcoding.chirp.domain.models.ChatParticipant
import com.cpcjrcoding.chirp.domain.type.UserId
import com.cpcjrcoding.chirp.infra.database.mappers.toChatParticipant
import com.cpcjrcoding.chirp.infra.database.mappers.toChatParticipantEntity
import com.cpcjrcoding.chirp.infra.database.repositories.ChatParticipantRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ChatParticipantService(
    private val chatParticipantRepository: ChatParticipantRepository,
) {
    fun createChatParticipant(chatParticipant: ChatParticipant) {
        chatParticipantRepository.save(
            chatParticipant.toChatParticipantEntity(),
        )
    }

    fun findChatParticipantById(userId: UserId): ChatParticipant? = chatParticipantRepository.findByIdOrNull(userId)?.toChatParticipant()

    fun findChatParticipantByEmailOrUsername(query: String): ChatParticipant? {
        val normalizedQuery = query.lowercase().trim()
        return chatParticipantRepository
            .findByEmailOrUsername(
                query = normalizedQuery,
            )?.toChatParticipant()
    }
}
