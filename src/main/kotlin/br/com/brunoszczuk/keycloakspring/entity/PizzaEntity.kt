package br.com.brunoszczuk.keycloakspring.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class PizzaEntity(@Id val id: Long, val name: String)
