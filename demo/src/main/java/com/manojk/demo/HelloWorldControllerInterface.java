package com.manojk.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/") // this annotation needed for swagger-ui to work
public interface HelloWorldControllerInterface {
    @GetMapping
    String helloWorld();
}
