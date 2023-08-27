package com.thecodealchemist.main.model;

import org.example.util.RequestModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("microservice-one")
public interface ServiceOneClient {
    @GetMapping
    public String hi();

    @GetMapping("/name/{userName}")
    public String hiByName(@PathVariable String userName);

    @PostMapping("/create")
    public String createSomething(@RequestBody RequestModel requestModel);
}
