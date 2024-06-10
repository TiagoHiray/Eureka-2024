package com.example.PIIEureka.Estande;

public record EstandeResponseDTO(int idEstande, int numEstande) {

    public EstandeResponseDTO(Estande estande) {
        this(estande.getIdEstande(), estande.getNumEstande());
    }
}
