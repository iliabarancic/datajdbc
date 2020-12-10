package de.ilia.datajdbc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories

@SpringBootApplication
@EnableJdbcRepositories
class DatajdbcApplication

fun main(args: Array<String>) {
    runApplication<DatajdbcApplication>(*args)
}
