package com.example.PIIEureka.Orientacao;

import com.example.PIIEureka.Aluno.Aluno;
import com.example.PIIEureka.Orientador.Orientador;
import com.example.PIIEureka.Trabalho.Trabalho;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "orientacao")
@Table(name = "orientacao")
@Getter
@Setter
public class Orientacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /* Esse atributo é criado apenas para não dar problema
       com a Anotação Entity que obriga que classe que virará tabela tenha um atributo de id único.
       Não deve ser usado no sistema de busca.
     */

    @ManyToOne
    @JoinColumn(name = "id_aluno")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "id_orientador")
    private Orientador orientador;

    @ManyToOne
    @JoinColumn(name = "id_trabalho")
    private Trabalho trabalho;
}
