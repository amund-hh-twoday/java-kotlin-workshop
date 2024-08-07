package com.twoday.kotlin_spring_boot.service

import java.time.LocalDate
import java.util.UUID
import org.springframework.stereotype.Service
import com.twoday.kotlin_spring_boot.model.TodoEntry
import com.twoday.kotlin_spring_boot.repository.TodoRepository

@Service
class TodoService(
    private val todoRepository: TodoRepository
) {

    fun add(todo: String): UUID {
        val todoEntry = TodoEntry(UUID.randomUUID(), LocalDate.now(), todo, false)
        val updated = todoRepository.insertTodo(todoEntry)
        return todoEntry.id
    }

    fun getById(id: UUID): TodoEntry? {
        return todoRepository.getById(id)
    }
}