package com.estudantes.repository;

import com.estudantes.entities.Estudantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository <Estudantes,Long> {
    
}
