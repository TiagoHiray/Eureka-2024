package com.example.PIIEureka.Controller;

import com.example.PIIEureka.Aluno.Aluno;
import com.example.PIIEureka.Aluno.AlunoRepository;
import com.example.PIIEureka.Aluno.AlunoResponseDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("getAluno/{ra}")
    public ResponseEntity<String> getAluno(@PathVariable("ra") Integer ra) throws JsonProcessingException {
        Optional<Aluno> alunoOptional = repository.findByRa(ra);
        if (alunoOptional.isPresent()) {
            AlunoResponseDTO alunoDTO = new AlunoResponseDTO(alunoOptional.get());
            return ResponseEntity.ok(objectMapper.writeValueAsString(alunoDTO)); // 200
        } else {
            return ResponseEntity.notFound().build(); // 404
        }
    }

    @GetMapping("getAllAlunos")
    private String getAllAlunos() throws JsonProcessingException {
        List<Aluno> alunos = repository.findAll();
        return objectMapper.writeValueAsString(alunos);
    }
}
