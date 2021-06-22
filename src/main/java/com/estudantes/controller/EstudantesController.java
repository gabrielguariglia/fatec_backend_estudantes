package com.estudantes.controller;

import java.util.ArrayList;
import java.util.List;
import com.estudantes.entities.Estudantes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudantes")

public class EstudantesController {
    
    //Endpoint
    //Devolve os Estudantes
    @GetMapping
    public List <Estudantes> getEstudantes(){

        ArrayList <Estudantes> lista =  new ArrayList<>();

        Estudantes e1 = new Estudantes();
        e1.setId(1);
        e1.setNome("Pedro Adoryan");
        e1.setIdade(19);
        e1.setCurso("Veterinária");
        e1.setFaculdade("UNASP");

        Estudantes e2 = new Estudantes();
        e2.setId(2);
        e2.setNome("Pedro Rodrigues");
        e2.setIdade(15);
        e2.setCurso("Automação Industrial");
        e2.setFaculdade("IF"); 

        lista.add(e1);
        lista.add(e2);

        return lista;
    }
}
