package com.example.subastainversaapp.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Servicio implements Serializable {

    @SerializedName("id_servicio")
    private long idServicio;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("descripcion_servicio")
    private String descripcion_servicio;

    public Servicio(String nombre, String descripcion_servicio) {
        this.nombre = nombre;
        this.descripcion_servicio = descripcion_servicio;
    }

    public Servicio() {
    }

    public long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(long idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion_servicio() {
        return descripcion_servicio;
    }

    public void setDescripcion_servicio(String descripcion_servicio) {
        this.descripcion_servicio = descripcion_servicio;
    }
}
