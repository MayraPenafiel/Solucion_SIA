package com.example.subastainversaapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Proveedor extends Persona {

    @SerializedName("anios_exp")
    private String anios_experiencia;

    @SerializedName("id_usuario")
    private Usuario usuario;

    @SerializedName( "id_servicio")
    private List<Servicio> servicios = new ArrayList<>();

    public Proveedor(Long id_persona, String nombre, String apellido, String email, String telefono, String direccion, String anios_experiencia, Usuario usuario, List<Servicio> servicios) {
        super(id_persona, nombre, apellido, email, telefono, direccion);
        this.anios_experiencia = anios_experiencia;
        this.usuario = usuario;
        this.servicios = servicios;
    }

    public String getAnios_experiencia() {
        return anios_experiencia;
    }

    public void setAnios_experiencia(String anios_experiencia) {
        this.anios_experiencia = anios_experiencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}
