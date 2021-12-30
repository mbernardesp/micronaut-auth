package br.com.auth.configuration

import br.com.auth.model.User
import br.com.auth.repository.UserRepository
import io.micronaut.context.event.StartupEvent
import io.micronaut.runtime.event.annotation.EventListener

import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
class StartupService(private val userRepository: UserRepository) {

    private val log = LoggerFactory.getLogger(StartupService::class.java)

    @EventListener
    fun onStartupEvent(event: StartupEvent) {

        val user = userRepository.saveEncoded(
            User(
                12345678910,
                "master"
            )
        )

        log.info("Usuario adicionado: {}", user)
    }
}