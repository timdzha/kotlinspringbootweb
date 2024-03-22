package ru.timdzha.example.kotlinspringbootweb

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table("messages")
data class Message(@Id val id: UUID?, val text: String)