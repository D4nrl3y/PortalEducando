package com.example.exit.portaleducando.model;

import java.io.Serializable;

/**
 * Created by Allef on 09/11/2016.
 */

public class Turma implements Serializable {

    private Integer id;
    private String nome;
    private String turno;

    public Turma() {}

    public Turma(Integer id, String nome, String turno) {
        this.id = id;
        this.nome = nome;
        this.turno = turno;
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
