package de.simon.herokufeatures

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping
    fun hello() = "Hello World"
}