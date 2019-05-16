package io.pivotal.shinyay.simple

import io.pivotal.shinyay.simple.greetings.HelloHandler
import org.springframework.context.support.beans
import org.springframework.web.reactive.function.server.router

val beans = beans {
    bean<HelloHandler>()
    bean {
        routes(ref())
    }
}

fun routes(helloHandler: HelloHandler) = router {
    "/".nest {
        GET("/", helloHandler::hello)
        "/hello".nest {
            GET("/", helloHandler::hello)
        }
    }
}