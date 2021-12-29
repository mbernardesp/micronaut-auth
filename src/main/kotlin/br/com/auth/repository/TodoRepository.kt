package br.com.auth.repository

import br.com.auth.model.Todo
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
public interface TodoRepository : JpaRepository<Todo, Long> {
}