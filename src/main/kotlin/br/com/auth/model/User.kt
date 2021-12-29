package br.com.auth.model

import io.micronaut.core.annotation.Introspected
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.Size

@Entity
@Introspected
data class User(

    @Id
    val cpf: Long,

    @Column
    @Size(min = 6)
    val password: String

)
