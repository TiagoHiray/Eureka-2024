package com.example.PIIEureka.Controller;

import com.example.PIIEureka.Orientador.Orientador;
import com.example.PIIEureka.Orientador.OrientadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Orientador")
public class OrientadorController {

    @Autowired
    OrientadorRepository repository;

    @GetMapping("getOrientador/{id}")
    public Orientador getOrientador(@PathVariable("id") Integer id) {
        return repository.getReferenceById(id);
    }

}
