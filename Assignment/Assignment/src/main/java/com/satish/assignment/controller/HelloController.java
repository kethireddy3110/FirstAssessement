package com.satish.assignment.controller;

import com.satish.assignment.model.HelloObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/hello/{name}")
    public String methodWithPathParam(@PathVariable String name) {
        return "Hello "+name;
    }

    @GetMapping("/helloObject")
    public HelloObject helloObject() {
        return new HelloObject("Hello World");
    }
}
