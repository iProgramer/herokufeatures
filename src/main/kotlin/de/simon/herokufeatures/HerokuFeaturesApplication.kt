package de.simon.herokufeatures

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HerokuFeaturesApplication

fun main(args: Array<String>) {
	runApplication<HerokuFeaturesApplication>(*args)
}
