package com.example.PIIEureka.Controller;

import com.example.PIIEureka.Estande.Estande;
import com.example.PIIEureka.Estande.EstandeRepository;
import com.example.PIIEureka.Estande.EstandeResponseDTO;
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
@RequestMapping("estande")
public class EstandeController {

    @Autowired
    private EstandeRepository repository;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("getEstande/{num}")
    public ResponseEntity<String> getEstande(@PathVariable("num") int num) throws JsonProcessingException {
        Optional<Estande> optionalEstande = repository.findById(num);

        if(optionalEstande.isPresent()) {
            EstandeResponseDTO estandeDTO = new EstandeResponseDTO(optionalEstande.get());
            return ResponseEntity.ok(objectMapper.writeValueAsString(estandeDTO));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("getAllEstandes")
    public List<Estande> getAllEstandes() {
        return repository.findAll();
    }
}
