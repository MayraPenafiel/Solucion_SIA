package com.example.subastainversaapp.entity;

public class User {

    private int id_user;
    private String nombre_user;
    private String rol;
    private String contraseña;

    public User(int id_user, String nombre_user, String rol, String contraseña) {
        this.id_user = id_user;
        this.nombre_user = nombre_user;
        this.rol = rol;
        this.contraseña = contraseña;
    }

    public User() {
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "User{" +
                "id_user=" + id_user +
                ", nombre_user='" + nombre_user + '\'' +
                ", rol='" + rol + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
