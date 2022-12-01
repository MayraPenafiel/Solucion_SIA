package com.example.subastainversaapp.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Oferta implements Serializable{
    @SerializedName("id_oferta")
    private Long idOferta;
    @SerializedName("percio_ferta")
    private Double percioOferta;
    @SerializedName("fecha_oferta")
    private String fecha;

    @SerializedName("comentario_calificacion_oferta")
    private String comentario_calificacion_oferta;
    @SerializedName("estado_oferta")
    private String estado;

    @SerializedName("id_proveedor")
    Proveedor proveedor = new Proveedor();
    @SerializedName("id_subasta")
    Subasta subasta = new Subasta();

    public Oferta() {
    }

    public Oferta(Long idOferta, Double percioOferta, String fecha, String comentario_calificacion_oferta, String estado, Proveedor proveedor, Subasta subasta) {
        this.idOferta = idOferta;
        this.percioOferta = percioOferta;
        this.fecha = fecha;
        this.comentario_calificacion_oferta = comentario_calificacion_oferta;
        this.estado = estado;
        this.proveedor = proveedor;
        this.subasta = subasta;
    }

    public Long getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Long idOferta) {
        this.idOferta = idOferta;
    }

    public Double getPercioOferta() {
        return percioOferta;
    }

    public void setPercioOferta(Double percioOferta) {
        this.percioOferta = percioOferta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getComentario_calificacion_oferta() {
        return comentario_calificacion_oferta;
    }

    public void setComentario_calificacion_oferta(String comentario_calificacion_oferta) {
        this.comentario_calificacion_oferta = comentario_calificacion_oferta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Subasta getSubasta() {
        return subasta;
    }

    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }
}

