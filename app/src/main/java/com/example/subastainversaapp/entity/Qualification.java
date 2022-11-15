package com.example.subastainversaapp.entity;

import java.util.Date;

public class Qualification {
    private Long id_valoracion;
    private String comentario_valoracion;
    private Integer puntos_calificacion;
    private Date fecha_calificacion;
    private Long id_proveedor;
    private Long id_servicio;

    public Qualification() {
    }

    public Qualification(Long id_valoracion, String comentario_valoracion, Integer puntos_calificacion, Date fecha_calificacion, Long id_proveedor, Long id_servicio) {
        this.id_valoracion = id_valoracion;
        this.comentario_valoracion = comentario_valoracion;
        this.puntos_calificacion = puntos_calificacion;
        this.fecha_calificacion = fecha_calificacion;
        this.id_proveedor = id_proveedor;
        this.id_servicio = id_servicio;
    }

    public Long getId_valoracion() {
        return id_valoracion;
    }

    public void setId_valoracion(Long id_valoracion) {
        this.id_valoracion = id_valoracion;
    }

    public String getComentario_valoracion() {
        return comentario_valoracion;
    }

    public void setComentario_valoracion(String comentario_valoracion) {
        this.comentario_valoracion = comentario_valoracion;
    }

    public Integer getPuntos_calificacion() {
        return puntos_calificacion;
    }

    public void setPuntos_calificacion(Integer puntos_calificacion) {
        this.puntos_calificacion = puntos_calificacion;
    }

    public Date getFecha_calificacion() {
        return fecha_calificacion;
    }

    public void setFecha_calificacion(Date fecha_calificacion) {
        this.fecha_calificacion = fecha_calificacion;
    }

    public Long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public Long getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(Long id_servicio) {
        this.id_servicio = id_servicio;
    }
}

