package com.example.PIIEureka.Trabalho;

import com.example.PIIEureka.Estande.Estande;

public record TrabalhoResponseDTO(int idTrabalho, String tituloTrabalho, String descTrabalho, int anoLetivo, Estande estande) {

    public TrabalhoResponseDTO(Trabalho trabalho) {
        this (
                trabalho.getIdTrabalho(),
                trabalho.getTituloTrabalho(),
                trabalho.getDescTrabalho(),
                trabalho.getAnoLetivo(),
                trabalho.getEstande()
        );
    }
}
