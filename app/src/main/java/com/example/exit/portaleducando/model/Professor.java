package com.example.exit.portaleducando.model;

import java.io.Serializable;

/**
 * Created by Allef on 09/11/2016.
 */

public class Professor implements Serializable {

    private Integer id;
    private String nome;
    private String sexo;
    private String data_nascimento;
    private String cpf;
    private Endereco endereco;
    private String telefone;
    private String login;
    private String senha;
    private Integer id_perfil_usuario;
    private String status;

    public Professor() {}

    public Professor(Integer id, String nome, String sexo, String data_nascimento, String cpf, Endereco endereco, String telefone, String login, String senha, Integer id_perfil_usuario, String status) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
        this.id_perfil_usuario = id_perfil_usuario;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public Integer getId_perfil_usuario() {
        return id_perfil_usuario;
    }

    public void setId_perfil_usuario(Integer id_perfil_usuario) {
        this.id_perfil_usuario = id_perfil_usuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
