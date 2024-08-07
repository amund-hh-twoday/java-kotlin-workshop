package com.twoday.kotlin_spring_boot.model

import java.time.LocalDate
import java.util.UUID

data class TodoEntry(val id: UUID, val date: LocalDate, val todo: String, val completed: Boolean)