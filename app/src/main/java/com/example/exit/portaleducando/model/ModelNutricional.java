package com.example.exit.portaleducando.model;

import java.io.Serializable;

/**
 * Created by Allef on 10/11/2016.
 */

public class ModelNutricional implements Serializable {

    private Integer id;
    private String nome;
    private String data_inicio;
    private String data_fim;
    private String frutas;
    private String bebidas;
    private String proteinas;
    private String acompanhamento;

    public ModelNutricional() {}

    public ModelNutricional(Integer id, String nome, String data_inicio, String data_fim, String frutas, String bebidas, String proteinas, String acompanhamento) {
        this.id = id;
        this.nome = nome;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.frutas = frutas;
        this.bebidas = bebidas;
        this.proteinas = proteinas;
        this.acompanhamento = acompanhamento;
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

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_fim() {
        return data_fim;
    }

    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    public String getFrutas() {
        return frutas;
    }

    public void setFrutas(String frutas) {
        this.frutas = frutas;
    }

    public String getBebidas() {
        return bebidas;
    }

    public void setBebidas(String bebidas) {
        this.bebidas = bebidas;
    }

    public String getProteinas() {
        return proteinas;
    }

    public void setProteinas(String proteinas) {
        this.proteinas = proteinas;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
}
