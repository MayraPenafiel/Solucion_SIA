package com.example.subastainversaapp.entity;

public class Client {

    private int id_cliente;

    public Client() {
    }

    public Client(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id_cliente=" + id_cliente +
                '}';
    }
}
