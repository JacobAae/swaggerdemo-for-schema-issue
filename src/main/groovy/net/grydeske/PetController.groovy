package net.grydeske

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Post
import io.swagger.v3.oas.annotations.parameters.RequestBody


@Controller("/pet")
class PetController {

    @Post("/")
    String index(@RequestBody Pet pet) {
        String thePet = "The pet input: $pet"
        println thePet

        thePet
    }
}