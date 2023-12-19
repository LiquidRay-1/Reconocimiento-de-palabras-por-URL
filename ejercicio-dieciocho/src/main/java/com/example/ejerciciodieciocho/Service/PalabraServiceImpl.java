package com.example.ejerciciodieciocho.Service;

import org.springframework.stereotype.Service;

@Service
public class PalabraServiceImpl implements PalabraService {

    @Override
    public String verificarSingularPlural(String palabra) {
        if (palabra.endsWith("s")) {
            return "plural";
        } else {
            return "singular";
        }
    }
}
