package com.thecodealchemist.main.controller;

import com.thecodealchemist.main.model.ServiceOneClient;
import org.example.util.RequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Service 2
public class GreetController {

    @Autowired
    private ServiceOneClient serviceOneClient;

    @GetMapping
    public String greet() {
        String res = serviceOneClient.hiByName("Dummy");
        //call Microservice1 <=== response
        return "Received response from MicroService 2 {" + res +"}";
    }

    @PostMapping("/createOne")
    public String dosomething(@RequestBody RequestModel requestModel) {
        return serviceOneClient.createSomething(requestModel);
    }
}
