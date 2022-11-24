package com.example.subastainversaapp.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Persona implements Serializable {

    @SerializedName("id_persona")
    private Long id_persona;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("apellido")
    private String apellido;
    @SerializedName("email")
    private String email;
    @SerializedName("telefono")
    private String telefono;
    @SerializedName("direccion")
    private String direccion;
    public Persona() {
    }

    public Persona(Long id_persona, String nombre, String apellido, String email, String telefono, String direccion) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}
