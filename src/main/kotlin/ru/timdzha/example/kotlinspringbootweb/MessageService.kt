package ru.timdzha.example.kotlinspringbootweb

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import java.util.Optional
import java.util.UUID

@Service
class MessageService(val db: JdbcTemplate) {

    fun findMessages(): List<Message> = db.query("SELECT * FROM messages") { response, _ ->
        Message(
            response.getObject("id", UUID::class.java),
            response.getString("text")
        )
    }

    fun findMessageById(id: UUID): List<Message> = db.query("SELECT * FROM messages WHERE id = '$id'") { response, _ ->
        Message(
            response.getObject("id", UUID::class.java),
            response.getString("text")
        )
    }

    fun save(message: Message) {
        val id = message.id ?: UUID.randomUUID()
        db.update(
            "INSERT INTO messages VALUES ( ?, ? )",
            id, message.text
        )
    }

    // extension function of List
    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
}