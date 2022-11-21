package com.example.subastainversaapp.entity;

public class Service {
    private Long id_servicio;
    private String nombre_servicio;
    private String descripcion_sercvicio;

    public Service() {
    }

    public Service(Long id_servicio, String nombre_servicio, String descripcion_sercvicio) {
        this.id_servicio = id_servicio;
        this.nombre_servicio = nombre_servicio;
        this.descripcion_sercvicio = descripcion_sercvicio;
    }

    public Long getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(Long id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public String getDescripcion_sercvicio() {
        return descripcion_sercvicio;
    }

    public void setDescripcion_sercvicio(String descripcion_sercvicio) {
        this.descripcion_sercvicio = descripcion_sercvicio;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id_servicio=" + id_servicio +
                ", nombre_servicio='" + nombre_servicio + '\'' +
                ", descripcion_sercvicio='" + descripcion_sercvicio + '\'' +
                '}';
    }
}