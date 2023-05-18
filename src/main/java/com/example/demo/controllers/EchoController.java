package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class EchoController {
    
    @PostMapping("/echo")
    public String echo(@RequestBody String value) {
        return value + " ... " + value;
    }
}
