package com.example.PIIEureka.Aluno;

import com.example.PIIEureka.Trabalho.Trabalho;
import com.fasterxml.jackson.core.JsonProcessingException;

public record AlunoResponseDTO (int idAluno, int raAluno, String nomeAluno, String curAluno, Trabalho trabalho) {


    public AlunoResponseDTO(Aluno aluno) throws JsonProcessingException {
        this(aluno.getIdAluno(), aluno.getRaAluno(), aluno.getNomeAluno(), aluno.getCurAluno(), aluno.getTrabalho());
    }
}
