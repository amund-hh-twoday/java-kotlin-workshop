package com.twoday.kotlin_spring_boot.repository

import java.sql.ResultSet
import java.util.UUID
import org.springframework.jdbc.core.RowMapper
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository
import com.twoday.kotlin_spring_boot.model.TodoEntry

private val INSERT =
    """
INSERT INTO todo (id, date, todo, completed) 
VALUES (:id, :date, :todo, :completed)
"""

private val SELECT_BY_DATE =
    """
    SELECT todo
    FROM todo 
    WHERE id = :id
"""

@Repository
class TodoRepository(val jdbcTemplate: NamedParameterJdbcTemplate) {

    fun insertTodo(entry: TodoEntry): Int =
        jdbcTemplate.update(
            INSERT, MapSqlParameterSource()
                .addValue("id", entry.id)
                .addValue("date", entry.date)
                .addValue("todo", entry.todo)
                .addValue("completed", entry.completed)
        )

    fun getById(id: UUID): TodoEntry? {
        val params = MapSqlParameterSource()
            .addValue("id", id)
        return jdbcTemplate.queryForObject(
            SELECT_BY_DATE,
            params,
            TodoEntryRowMapper()
        )
    }

    private class TodoEntryRowMapper : RowMapper<TodoEntry> {
        override fun mapRow(rs: ResultSet, rowNum: Int): TodoEntry {
            return TodoEntry(
                id = rs.getObject("id") as UUID,
                date = rs.getDate("date").toLocalDate(),
                todo = rs.getObject("todo") as String,
                completed = rs.getObject("completed") as Boolean,
            )
        }
    }
}