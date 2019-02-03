package com.example.hipolito.dfood.models;

public class Restaurante {

    private String nome;
    private String localizacao;
    private String status;
    private int classificacao;

    public Restaurante(String nome, String localizacao, String status, int classificacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.status = status;
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
