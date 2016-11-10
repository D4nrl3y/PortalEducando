package com.example.exit.portaleducando.model;

import java.io.Serializable;

/**
 * Created by Allef on 10/11/2016.
 */

public class Notas implements Serializable {

    private Aluno aluno;
    private Disciplina disciplina;
    private String faltas;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double media;
    private String status;
    private Professor professor;
    private Turma turma;

    public Notas() {}

    public Notas(Aluno aluno, Disciplina disciplina, String faltas, double nota1, double nota2, double nota3, double nota4, double media, String status, Professor professor, Turma turma) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.faltas = faltas;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.media = media;
        this.status = status;
        this.professor = professor;
        this.turma = turma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getFaltas() {
        return faltas;
    }

    public void setFaltas(String faltas) {
        this.faltas = faltas;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
}
