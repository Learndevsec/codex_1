package com.example.basicspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BasicSpringBootApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void helloWithNameReturnsGreeting() {
        HelloController helloController = new HelloController();
        assertEquals("Hello, Codex!", helloController.helloWithName("Codex"));
    }

    @Test
    void helloWithNameReturnsFallbackWhenBodyIsBlank() {
        HelloController helloController = new HelloController();
        assertEquals("Hello, friend!", helloController.helloWithName("   "));
    }
}
