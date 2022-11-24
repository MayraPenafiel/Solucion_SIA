package com.example.subastainversaapp.entity;

public class Client {
    private Long id_cliente;
    private String contrasena;

    public Client(Long id_cliente, String contrasena) {
        this.id_cliente = id_cliente;
        this.contrasena = contrasena;
    }

    public Client() {
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
