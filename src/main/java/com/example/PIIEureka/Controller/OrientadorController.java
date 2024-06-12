package com.example.PIIEureka.Controller;

import com.example.PIIEureka.Orientador.Orientador;
import com.example.PIIEureka.Orientador.OrientadorRepository;
import com.example.PIIEureka.Orientador.OrientadorResponseDTO;
import com.example.PIIEureka.Trabalho.Trabalho;
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
@RequestMapping("orientador")
public class OrientadorController {

    @Autowired
    OrientadorRepository repository;
    ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("getOrientador/{id}")
    public ResponseEntity<String> getOrientador(@PathVariable("id") Integer id) throws JsonProcessingException {
        Optional<Orientador> orientadorOptional = repository.findById(id);

        if(orientadorOptional.isPresent()) {
            OrientadorResponseDTO orientadorDTO = new OrientadorResponseDTO(orientadorOptional.get());
            return ResponseEntity.ok(objectMapper.writeValueAsString(orientadorDTO));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("getAllOrientadores")
    public List<Orientador> getAllOrientadores() {
        return repository.findAll();
    }

}
