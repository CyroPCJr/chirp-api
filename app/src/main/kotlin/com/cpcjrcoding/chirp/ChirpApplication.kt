package com.cpcjrcoding.chirp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChirpApplication

@Suppress("SpreadOperator")
fun main(args: Array<String>) {
    runApplication<ChirpApplication>(*args)
}
