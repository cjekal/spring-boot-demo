package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class EchoController {
    
    private int unusedInteger;
    
    @PostMapping("/echo")
    public String echo(@RequestBody String value) {
        System.out.println("haha!");
        return value + " ... " + value + " main branch! one more change!";
    }
}
