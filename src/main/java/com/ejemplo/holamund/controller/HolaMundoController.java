package com.ejemplo.holamund.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "¡Hola Mundo desde Spring Boot!";
    }
}