package com.example.subastainversaapp.entity;

import java.util.Date;
import com.google.gson.annotations.SerializedName;
public class Sale {
    @SerializedName("id_subasta")
    private Long id_subasta;
    @SerializedName("id_cliente")
    private Long id_cliente;
    @SerializedName("id_oferta")
    private Long id_oferta;
    @SerializedName("fecha_inicio")
    private Date fecha_inicio;
    @SerializedName("fecha_fin")
    private Date fecha_fin;
    @SerializedName("descripcion_subasta")
    private  String descripcion_subasta;
    @SerializedName("imagen_subast")
    private String imagen_subast;
    @SerializedName("estado_subasta")
    private String estado_subasta;

    public Sale() {
    }

    public Sale(Long id_subasta, Long id_cliente, Long id_oferta, Date fecha_inicio, Date fecha_fin, String descripcion_subasta, String imagen_subast, String estado_subasta) {
        this.id_subasta = id_subasta;
        this.id_cliente = id_cliente;
        this.id_oferta = id_oferta;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion_subasta = descripcion_subasta;
        this.imagen_subast = imagen_subast;
        this.estado_subasta = estado_subasta;
    }

    public Long getId_subasta() {
        return id_subasta;
    }

    public void setId_subasta(Long id_subasta) {
        this.id_subasta = id_subasta;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Long getId_oferta() {
        return id_oferta;
    }

    public void setId_oferta(Long id_oferta) {
        this.id_oferta = id_oferta;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getDescripcion_subasta() {
        return descripcion_subasta;
    }

    public void setDescripcion_subasta(String descripcion_subasta) {
        this.descripcion_subasta = descripcion_subasta;
    }

    public String getImagen_subast() {
        return imagen_subast;
    }

    public void setImagen_subast(String imagen_subast) {
        this.imagen_subast = imagen_subast;
    }

    public String getEstado_subasta() {
        return estado_subasta;
    }

    public void setEstado_subasta(String estado_subasta) {
        this.estado_subasta = estado_subasta;
    }
}
