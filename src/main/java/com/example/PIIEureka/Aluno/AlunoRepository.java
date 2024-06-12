package com.example.PIIEureka.Aluno;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    @Query("SELECT a FROM alunos a WHERE a.raAluno =:raAluno")
    Optional<Aluno> findByRa(@Param("raAluno") int raAluno);

}

