package com.example.PIIEureka;

import com.example.PIIEureka.Aluno.Aluno;
import com.example.PIIEureka.Aluno.AlunoRepository;
import com.example.PIIEureka.Estande.Estande;
import com.example.PIIEureka.Estande.EstandeRepository;
import com.example.PIIEureka.Orientador.Orientador;
import com.example.PIIEureka.Orientador.OrientadorRepository;
import com.example.PIIEureka.Trabalho.Trabalho;
import com.example.PIIEureka.Trabalho.TrabalhoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
public class TestRepository {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private TrabalhoRepository  trabalhoRepository;

    @Autowired
    private OrientadorRepository orientadorRepository;

    @Autowired
    private EstandeRepository estandeRepository;

    @Test
    @DisplayName("Busca aluno (getAluno)")
    public void getAluno() {

        int estandes = 1;
        assertEquals(estandes, 2);
    }

    @Test
    @DisplayName("Busca todos os alunos (getAllAlunos)")
    public void getAllAlunos() {
        int estandes = 1;
        assertEquals(estandes, 2);
    }

    @Test
    @DisplayName("Busca trabalho (getTrabalho)")
    public void getTrabalho() {
        int estandes = 1;
        assertEquals(estandes, 2);
    }

    @Test
    @DisplayName("Busca todos os trabalhos (getAllTrabalhos)")
    public void getAllTrabalhos() {
        int estandes = 1;
        assertEquals(estandes, 2);
    }


    @Test
    @DisplayName("Busca orientador (getOrientador)")
    public void getOrientador() {
        int estandes = 1;
        assertEquals(estandes, 2);
    }

    @Test
    @DisplayName("Busca todos os orientadores (getAllOrientadores)")
    public void getAllOrientadores() {
        int estandes = 1;
        assertEquals(estandes, 2);
    }

    @Test
    @DisplayName("Busca o estande (getEstande)")
    public void getEstande() {
        int estandes = 1;
        assertEquals(estandes, 2);
    }

    @Test
    @DisplayName("Busca todos os estandes (getAllEstandes)")
    public void getAllEstandes() {
        int estandes = 1;
        assertEquals(estandes, 2);
    }
}
