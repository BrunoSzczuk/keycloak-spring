package br.com.brunoszczuk.keycloakspring.endpoint

import br.com.brunoszczuk.keycloakspring.entity.PizzaEntity
import br.com.brunoszczuk.keycloakspring.repository.PizzaRepository
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
@RequestMapping("/api/v1/pizzas")
class PizzaEndpoint(private val pizzaRepository: PizzaRepository) {

    @GetMapping
    @PreAuthorize("hasRole('pizza-read')")
    fun findAll(): List<PizzaEntity> {
        return pizzaRepository.findAll()
    }

    @PostMapping
    @PreAuthorize("hasRole('pizza-write')")
    fun create(): PizzaEntity {
        return pizzaRepository.save(PizzaEntity(Random.nextLong(), "Pizza ${Random.nextInt()}"))
    }
}
