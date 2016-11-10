package com.example.exit.portaleducando.model;

import java.io.Serializable;

/**
 * Created by Allef on 09/11/2016.
 */

public class Endereco implements Serializable {

    private String cep;
    private String cidade;
    private String estado;
    private String rua;
    private String bairro;
    private String numero;

    public Endereco() {}

    public Endereco(String cep, String cidade, String estado, String rua, String bairro, String numero) {
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
