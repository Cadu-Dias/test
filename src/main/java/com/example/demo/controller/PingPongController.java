package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {
    
    @GetMapping("/ping")
    public String pingPong() {
        return "pong";
    }
}
