package ru.timdzha.example.kotlinspringbootweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBootWebApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringBootWebApplication>(*args)
}
