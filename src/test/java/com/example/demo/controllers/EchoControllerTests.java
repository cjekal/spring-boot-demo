package com.example.demo.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class EchoControllerTests {
    
    @InjectMocks
    private EchoController controller;

    @Test
    public void echosBack() {
        assertThat(controller.echo("hello")).isEqualTo("hello ... hello");
    }
}
