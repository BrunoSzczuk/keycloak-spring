package br.com.brunoszczuk.keycloakspring.repository

import br.com.brunoszczuk.keycloakspring.entity.PizzaEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PizzaRepository : JpaRepository<PizzaEntity, Long> {
}