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

        Optional<Aluno> aluno = alunoRepository.findById(5);
        assertEquals(Aluno.class, aluno.get().getClass());
    }

    @Test
    @DisplayName("Busca todos os alunos (getAllAlunos)")
    public void getAllAlunos() {
        List<Aluno> alunos = alunoRepository.findAll();
        assertFalse(alunos.isEmpty());
    }

    @Test
    @DisplayName("Busca trabalho (getTrabalho)")
    public void getTrabalho() {
        Optional<Trabalho> trabalho = trabalhoRepository.findById(1);
        assertEquals(Trabalho.class, trabalho.get().getClass());
    }

    @Test
    @DisplayName("Busca todos os trabalhos (getAllTrabalhos)")
    public void getAllTrabalhos() {
        List<Trabalho> trabalhos = trabalhoRepository.findAll();

        assertFalse(trabalhos.isEmpty());
    }


    @Test
    @DisplayName("Busca orientador (getOrientador)")
    public void getOrientador() {
        Optional<Orientador> orientador = orientadorRepository.findById(1);

        assertEquals(Orientador.class, orientador.get().getClass());
    }

    @Test
    @DisplayName("Busca todos os orientadores (getAllOrientadores)")
    public void getAllOrientadores() {
        List<Orientador> orientadores = orientadorRepository.findAll();

        assertFalse(orientadores.isEmpty());
    }

    @Test
    @DisplayName("Busca o estande (getEstande)")
    public void getEstande() {
        Optional<Estande> estande = estandeRepository.findById(1);
        assertEquals(Estande.class, estande.get().getClass());
    }

    @Test
    @DisplayName("Busca todos os estandes (getAllEstandes)")
    public void getAllEstandes() {
        List<Estande> estandes = estandeRepository.findAll();
        assertFalse(estandes.isEmpty());
    }
}
