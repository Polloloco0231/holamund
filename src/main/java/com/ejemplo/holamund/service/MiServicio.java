package com.ejemplo.holamund.service;

import org.springframework.stereotype.Service;

@Service
public class MiServicio {
    public String obtenerSaludo() {
        return "¡Hola desde el servicio!";
    }
}
