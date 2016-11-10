package com.example.exit.portaleducando.model;

import java.io.Serializable;

/**
 * Created by Allef on 09/11/2016.
 */

public class Disciplina implements Serializable {

    private Integer id;
    private String nome;
    private Professor professor;
    private Turma turma;
    private String status;

    public Disciplina() {}

    public Disciplina(Integer id, String nome, Professor professor, Turma turma, String status) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.turma = turma;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
