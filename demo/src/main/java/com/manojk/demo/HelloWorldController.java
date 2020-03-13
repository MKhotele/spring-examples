package com.manojk.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component // this annotation needed to initialize this controller
public class HelloWorldController implements HelloWorldControllerInterface {
    @Override
    public String helloWorld(){
        return "Hello World";
    }
}

