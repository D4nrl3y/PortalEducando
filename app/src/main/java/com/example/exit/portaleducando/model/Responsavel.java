package com.example.exit.portaleducando.model;

import java.io.Serializable;

/**
 * Created by Allef on 10/11/2016.
 */

public class Responsavel implements Serializable {

    private Integer id;
    private String nome;
    private String sexo;
    private String data_nascimento;
    private String cpf;
    private String telefone;
    private Integer id_aluno;
    private String login;
    private String senha;
    private Aluno aluno;
    private Integer id_perfil_usuario;

    public Responsavel() {}

    public Responsavel(Integer id, String nome, String sexo, String data_nascimento, String cpf, String telefone, Integer id_aluno, String login, String senha, Aluno aluno, Integer id_perfil_usuario) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.id_aluno = id_aluno;
        this.login = login;
        this.senha = senha;
        this.aluno = aluno;
        this.id_perfil_usuario = id_perfil_usuario;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(Integer id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Integer getId_perfil_usuario() {
        return id_perfil_usuario;
    }

    public void setId_perfil_usuario(Integer id_perfil_usuario) {
        this.id_perfil_usuario = id_perfil_usuario;
    }
}
