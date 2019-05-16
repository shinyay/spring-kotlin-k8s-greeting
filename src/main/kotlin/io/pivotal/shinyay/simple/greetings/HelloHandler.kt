package io.pivotal.shinyay.simple.greetings

import mu.KotlinLogging
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

class HelloHandler {
    private val logger = KotlinLogging.logger{}

    fun hello(request: ServerRequest): Mono<ServerResponse> {

        val name = request
                .queryParam("name")
                .orElse("guest")
        logger.info { "Hello, $name" }
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(
                        Mono.just(HelloResponse("Hello, $name")), HelloResponse::class.java
                )
    }
}