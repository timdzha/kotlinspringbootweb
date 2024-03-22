package ru.timdzha.example.kotlinspringbootweb.message

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table("MESSAGES")
data class Message(@Id val id: UUID?, val text: String)