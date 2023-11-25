package com.biairmal.deploydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping
    public Message hello() {
        return new Message("Hello world, the server is up and running!");
    }

}
