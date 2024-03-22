package ru.timdzha.example.kotlinspringbootweb

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class GreetingController {

    @GetMapping
    fun index(@RequestParam("name") name: String) = "Hello, $name!"
}