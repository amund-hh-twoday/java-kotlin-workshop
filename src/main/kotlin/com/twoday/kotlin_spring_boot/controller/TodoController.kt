package com.twoday.kotlin_spring_boot.controller

import java.util.UUID
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import com.twoday.kotlin_spring_boot.model.TodoEntry
import com.twoday.kotlin_spring_boot.service.TodoService

@RestController
class TodoController(val todoService: TodoService) {

    @PostMapping("/todo")
    fun todo(@RequestBody todo: String): ResponseEntity<UUID> {
        val id = todoService.add(todo)
        return ResponseEntity.ok(id)
    }

    @GetMapping("/todo/{id}")
    fun todo(@PathVariable id: UUID): ResponseEntity<TodoEntry> {
        val todo = todoService.getById(id)
        return ResponseEntity.ok(todo)
    }
}