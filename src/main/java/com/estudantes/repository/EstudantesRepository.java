package com.estudantes.repository;

import com.estudantes.entities.Estudantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudantesRepository extends JpaRepository <Estudantes,Long> {
    
}
