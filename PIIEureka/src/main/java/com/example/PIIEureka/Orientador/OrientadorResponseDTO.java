package com.example.PIIEureka.Orientador;

public record OrientadorResponseDTO(int idOrientador, String nomeOrientador) {

    public OrientadorResponseDTO(Orientador orientador) {
        this(orientador.getIdOrientador(), orientador.getNomeOrientador());
    }
}
