package com.example.hipolito.dfood.models;

public class Item {

    private String titulo;
    private String descricao;
    private String preco;

    public Item(String titulo, String descricao, String preco) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Item{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }
}
