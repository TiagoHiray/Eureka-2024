package com.example.PIIEureka.Aluno;

import com.example.PIIEureka.Trabalho.Trabalho;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "alunos")
@Table(name = "alunos")
@Getter
@Setter
public class Aluno {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_aluno", nullable = false, unique = true)
    private int idAluno;

    @Column(name = "ra_aluno")
    private int raAluno;

    @Column(name = "nome_aluno")
    private String nomeAluno;

    @Column(name = "cur_aluno")
    private String curAluno;

    @ManyToOne
    @JoinColumn(name = "id_trabalho", referencedColumnName = "id_trabalho")
    private Trabalho trabalho;
}
