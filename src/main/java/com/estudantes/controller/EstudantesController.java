package com.estudantes.controller;


import java.util.List;
import java.util.Optional;

import com.estudantes.entities.Estudantes;
import com.estudantes.repository.EstudantesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/estudantes")
@CrossOrigin

public class EstudantesController {

    @Autowired
    private EstudantesRepository repo;
    
    //Endpoint
    //Devolve os Estudantes
    @GetMapping
    public List <Estudantes> getEstudantes(){

      List<Estudantes> lista = repo.findAll();

        return lista;
    }

    //Endpoint
    //Devolve apenas um Estudante

    @GetMapping("{id}")
    public Estudantes getEstudante(@PathVariable Long id){

        Optional<Estudantes> op = repo.findById(id);
        Estudantes estudante = op.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        return estudante;
    }
}
