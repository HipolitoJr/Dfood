package com.example.hipolito.dfood.models;

public class Pedido {

    private String numero;
    private String restaurante;
    private String status;

    public Pedido(String numero, String restaurante, String status) {
        this.numero = numero;
        this.restaurante = restaurante;
        this.status = status;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
