package ru.timdzha.example.kotlinspringbootweb

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/messages")
class MessageController(val service: MessageService) {

    @GetMapping
    fun index() = service.findMessages()

    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: UUID) = service.findMessageById(id)

    @PostMapping
    fun post(@RequestBody message: Message) = service.save(message)
}