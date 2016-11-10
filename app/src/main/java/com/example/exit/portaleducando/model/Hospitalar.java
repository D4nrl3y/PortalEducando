package com.example.exit.portaleducando.model;

import java.io.Serializable;

/**
 * Created by Allef on 10/11/2016.
 */

public class Hospitalar implements Serializable {

    private Integer id;
    private String medicamentos1;
    private String medicamentos2;
    private String medicamentos3;
    private String alimentos1;
    private String alimentos2;
    private String alimentos3;
    private String cod_cartao;
    private String cartao_sus;
    private String empresa;
    private String ultimo_atestado;
    private Aluno aluno;
    private String acessibilidade;

    public Hospitalar() {}

    public Hospitalar(Integer id, String medicamentos1, String medicamentos2, String medicamentos3, String alimentos1, String alimentos2, String alimentos3, String cod_cartao, String cartao_sus, String empresa, String ultimo_atestado, Aluno aluno, String acessibilidade) {

        this.id = id;
        this.medicamentos1 = medicamentos1;
        this.medicamentos2 = medicamentos2;
        this.medicamentos3 = medicamentos3;
        this.alimentos1 = alimentos1;
        this.alimentos2 = alimentos2;
        this.alimentos3 = alimentos3;
        this.cod_cartao = cod_cartao;
        this.cartao_sus = cartao_sus;
        this.empresa = empresa;
        this.ultimo_atestado = ultimo_atestado;
        this.aluno = aluno;
        this.acessibilidade = acessibilidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicamentos1() {
        return medicamentos1;
    }

    public void setMedicamentos1(String medicamentos1) {
        this.medicamentos1 = medicamentos1;
    }

    public String getMedicamentos2() {
        return medicamentos2;
    }

    public void setMedicamentos2(String medicamentos2) {
        this.medicamentos2 = medicamentos2;
    }

    public String getMedicamentos3() {
        return medicamentos3;
    }

    public void setMedicamentos3(String medicamentos3) {
        this.medicamentos3 = medicamentos3;
    }

    public String getAlimentos1() {
        return alimentos1;
    }

    public void setAlimentos1(String alimentos1) {
        this.alimentos1 = alimentos1;
    }

    public String getAlimentos2() {
        return alimentos2;
    }

    public void setAlimentos2(String alimentos2) {
        this.alimentos2 = alimentos2;
    }

    public String getAlimentos3() {
        return alimentos3;
    }

    public void setAlimentos3(String alimentos3) {
        this.alimentos3 = alimentos3;
    }

    public String getCod_cartao() {
        return cod_cartao;
    }

    public void setCod_cartao(String cod_cartao) {
        this.cod_cartao = cod_cartao;
    }

    public String getCartao_sus() {
        return cartao_sus;
    }

    public void setCartao_sus(String cartao_sus) {
        this.cartao_sus = cartao_sus;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getUltimo_atestado() {
        return ultimo_atestado;
    }

    public void setUltimo_atestado(String ultimo_atestado) {
        this.ultimo_atestado = ultimo_atestado;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(String acessibilidade) {
        this.acessibilidade = acessibilidade;
    }
}
