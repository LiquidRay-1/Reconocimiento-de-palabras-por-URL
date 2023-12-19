package com.example.ejerciciodieciocho.Controller;

import com.example.ejerciciodieciocho.Service.PalabraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/singular-plural")
public class PalabraController {

    private final PalabraService palabraService;

    @Autowired
    public PalabraController(PalabraService palabraService) {
        this.palabraService = palabraService;
    }

    @GetMapping("/{palabra}")
    public String verificarSingularPlural(@PathVariable String palabra) {
        String resultado = palabraService.verificarSingularPlural(palabra);
        return "{\"result\":\"" + resultado + "\"}";
    }
}
