package org.web25.felix.jpm.hellogradle;

import io.femo.http.Http;
import io.femo.http.HttpServer;
import io.femo.http.handlers.Handlers;

public class HelloWorld {

    public static void main(String[] args) {
        HttpServer server = Http
                .server(8080)
                .get("/", (request, response) -> {
                    response.entity("Hello World");
                    return true;
                })
                .after(Handlers.log());
        server.start();
    }
}
