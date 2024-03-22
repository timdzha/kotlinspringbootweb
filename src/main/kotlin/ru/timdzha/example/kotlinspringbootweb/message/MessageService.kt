package ru.timdzha.example.kotlinspringbootweb.message

import org.springframework.stereotype.Service
import java.util.Optional
import java.util.UUID

@Service
class MessageService(val repository: MessageRepository) {

    fun findMessages(): List<Message> = repository.findAll().toList()

    fun findMessageById(id: UUID): Optional<Message> = repository.findById(id)

    fun save(message: Message) = repository.save(message)

    // extension function of List
    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
}