package br.com.brunoszczuk.keycloakspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity

@SpringBootApplication
@EnableWebSecurity
@EnableMethodSecurity
class KeycloakSpringApplication

fun main(args: Array<String>) {
	runApplication<KeycloakSpringApplication>(*args)
}
