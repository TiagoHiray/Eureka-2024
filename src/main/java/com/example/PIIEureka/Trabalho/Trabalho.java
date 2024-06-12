package com.example.PIIEureka.Trabalho;

import com.example.PIIEureka.Estande.Estande;
import com.example.PIIEureka.Orientador.Orientador;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "trabalhos")
@Table(name = "trabalhos")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Trabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_trabalho", nullable = false, unique = true)
    private int idTrabalho;

    @Column(name = "titulo_trabalho")
    private String tituloTrabalho;

    @Column(name = "desc_trabalho")
    private String descTrabalho;

    @Column(name = "ano_letivo")
    private int anoLetivo;

    @Column(name = "grupo_trabalho")
    private String grupoTrabalho;

    @OneToOne
    @JoinColumn(name = "numero_estande")
    private Estande estande;

    @ManyToOne
    @JoinColumn(name = "id_orientador")
    private Orientador orientador;
}