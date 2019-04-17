package net.grydeske

import com.fasterxml.jackson.annotation.JsonProperty
import groovy.transform.ToString
import io.swagger.v3.oas.annotations.media.Schema

@Schema(name="Pet Class", description = "It is always pets for demo - usually cats")
@ToString
class Pet {

    @Schema(
            description = """The name of the pet""",
            defaultValue = "",
            name = "pet_name", // Ignored - bug I think!
            title = "The name of the pet - for demo",
            example = "Kitty"
    )
    @JsonProperty("pet_name")
    String petName

}

