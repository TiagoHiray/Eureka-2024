package com.example.PIIEureka.Estande;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "estandes")
@Table(name = "estandes")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Estande {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_estande", nullable = false, unique = true)
    private int idEstande;

    @Column(name = "num_estande")
    private int numEstande;
}

