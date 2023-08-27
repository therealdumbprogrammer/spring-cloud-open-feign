package com.thecodealchemist.microserviceone.controller;

import org.example.util.RequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
//Service 1
public class HiController {

    @Autowired
    private Environment environment;

    @GetMapping
    public String hi() {
        return "Hi from Microservice 1, port = " + environment.getProperty("local.server.port");
    }

    @GetMapping("/name/{userName}")
    public String hiByName(@PathVariable String userName) {
        return "Hi "+ userName +" from Microservice 1, port = " + environment.getProperty("local.server.port");
    }

    @PostMapping("/create")
    public String createSomething(@RequestBody RequestModel requestModel) {
        System.out.println(requestModel);
        return "Resource created!";
    }
}
