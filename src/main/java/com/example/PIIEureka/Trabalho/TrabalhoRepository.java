package com.example.PIIEureka.Trabalho;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Integer> {

    @Query("SELECT t FROM trabalhos t WHERE t.idTrabalho =:idTrabalho")
    Optional<Trabalho> getTrabalho(@Param("idTrabalho") int idTrabalho);
}
