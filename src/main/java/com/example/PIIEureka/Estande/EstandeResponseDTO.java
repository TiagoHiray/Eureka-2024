package com.example.PIIEureka.Estande;

public record EstandeResponseDTO( int numEstande) {

    public EstandeResponseDTO(Estande estande) {
        this(estande.getNumEstande());
    }
}
