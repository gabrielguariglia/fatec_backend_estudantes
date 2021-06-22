package com.estudantes.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ESTUDANTE")
public class Estudantes implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long id;
    private String nome;
    private int idade;
    private String curso;
    private String faculdade;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getFaculdade() {
        return faculdade;
    }
    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Estudantes other = (Estudantes) obj;
        if (id != other.id)
            return false;
        return true;
    }

    
}