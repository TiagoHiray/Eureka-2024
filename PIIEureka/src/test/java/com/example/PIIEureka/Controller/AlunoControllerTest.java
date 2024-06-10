package com.example.PIIEureka.Controller;

import com.example.PIIEureka.Aluno.Aluno;
import com.example.PIIEureka.Aluno.AlunoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class AlunoControllerTest {

    @Autowired
    private AlunoRepository repository;

    @Test
    public void getAluno() {

        boolean existe = repository.existsById(5);
        assertTrue(existe);
    }

}