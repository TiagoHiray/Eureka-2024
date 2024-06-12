package com.example.PIIEureka.Controller;

import com.example.PIIEureka.Trabalho.Trabalho;
import com.example.PIIEureka.Trabalho.TrabalhoRepository;
import com.example.PIIEureka.Trabalho.TrabalhoResponseDTO;
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
@RequestMapping("trabalho")
public class TrabalhoController {

    @Autowired
    TrabalhoRepository repository;
    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("getTrabalho/{idTrabalho}")
    public ResponseEntity<String> getTrabalho(@PathVariable("idTrabalho") int idTrabalho) throws JsonProcessingException {
        Optional<Trabalho> trabalhoOptional = repository.findById(idTrabalho);

        if(trabalhoOptional.isPresent()) {
            TrabalhoResponseDTO trabalhoDTO = new TrabalhoResponseDTO(trabalhoOptional.get());
            return ResponseEntity.ok(objectMapper.writeValueAsString(trabalhoDTO));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("getAllTrabalhos")
    public List<Trabalho> getAllTrabalhos() {
        return repository.findAll();
    }
}
