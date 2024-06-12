package com.example.PIIEureka.Trabalho;

import com.example.PIIEureka.Estande.Estande;
import com.example.PIIEureka.Orientador.Orientador;

public record TrabalhoResponseDTO(
        int idTrabalho,
        String tituloTrabalho,
        String descTrabalho,
        int anoLetivo,
        String grupoTrabalho,
        Estande estande,
        Orientador orientador
) {

    public TrabalhoResponseDTO(Trabalho trabalho) {
        this (
                trabalho.getIdTrabalho(),
                trabalho.getTituloTrabalho(),
                trabalho.getDescTrabalho(),
                trabalho.getAnoLetivo(),
                trabalho.getGrupoTrabalho(),
                trabalho.getEstande(),
                trabalho.getOrientador()
        );
    }
}
