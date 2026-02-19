package com.example.basicspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from basic Spring Boot project!";
    }

    @PostMapping("/hello")
    public String helloWithName(@RequestBody String name) {
        String cleanedName = name == null ? "" : name.trim();
        if (cleanedName.isEmpty()) {
            return "Hello, friend!";
        }

        return "Hello, " + cleanedName + "!";
    }
}
