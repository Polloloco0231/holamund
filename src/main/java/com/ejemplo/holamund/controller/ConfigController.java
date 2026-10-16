package com.ejemplo.holamund.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${mensaje.bienvenida}")
    private String mensaje;

    @GetMapping
    public String obtenerMensaje() {
        return mensaje;
    }
}
