package com.example.subastainversaapp.entity;
import java.io.Serializable;


public class Person {
    private static final long serialVersionUID = 1L;

    private Long id_persona;
    private String nombre_persona;
    private String apellido_persona;
    private String email_persona;
    private String telefono_persona;
    private String direccion_persona;
    private String imagen_persona;
    private boolean estado_persona;

    public Long getId_persona() {
        return id_persona;
    }

    public Person(Long id_persona, String nombre_persona, String apellido_persona, String email_persona, String telefono_persona, String direccion_persona, String imagen_persona, boolean estado_persona) {
        this.id_persona = id_persona;
        this.nombre_persona = nombre_persona;
        this.apellido_persona = apellido_persona;
        this.email_persona = email_persona;
        this.telefono_persona = telefono_persona;
        this.direccion_persona = direccion_persona;
        this.imagen_persona = imagen_persona;
        this.estado_persona = estado_persona;
    }

    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getApellido_persona() {
        return apellido_persona;
    }

    public void setApellido_persona(String apellido_persona) {
        this.apellido_persona = apellido_persona;
    }

    public String getEmail_persona() {
        return email_persona;
    }

    public void setEmail_persona(String email_persona) {
        this.email_persona = email_persona;
    }

    public String getTelefono_persona() {
        return telefono_persona;
    }

    public void setTelefono_persona(String telefono_persona) {
        this.telefono_persona = telefono_persona;
    }

    public String getDireccion_persona() {
        return direccion_persona;
    }

    public void setDireccion_persona(String direccion_persona) {
        this.direccion_persona = direccion_persona;
    }

    public String getImagen_persona() {
        return imagen_persona;
    }

    public void setImagen_persona(String imagen_persona) {
        this.imagen_persona = imagen_persona;
    }

    public boolean getEstado_persona() {
        return estado_persona;
    }

    public void setEstado_persona(boolean estado_persona) {
        this.estado_persona = estado_persona;
    }
}
