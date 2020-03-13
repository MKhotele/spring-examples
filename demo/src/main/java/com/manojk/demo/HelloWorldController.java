package com.manojk.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/") // in the absence of any context-path, http://localhost:8080/ would show "Hello World"
public class HelloWorldController {
    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }
}

