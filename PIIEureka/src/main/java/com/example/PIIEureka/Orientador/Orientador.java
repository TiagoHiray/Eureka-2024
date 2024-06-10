package com.example.PIIEureka.Orientador;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity(name = "orientadores")
@Table(name = "orientadores")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Orientador {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_orientador", nullable = false, unique = true)
    private int idOrientador;

    @Column(name = "nome_orientador")
    private String nomeOrientador;

    //verificar sobre o atributo de RF !!!
//    @Column(name = "rf_orientador")
//    private String rfOrientador;
}
