package br.com.auth.repository

import br.com.auth.model.User
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
abstract class UserRepository : JpaRepository<User, Long> {
}