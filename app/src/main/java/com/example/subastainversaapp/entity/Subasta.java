package com.example.subastainversaapp.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class Subasta implements Serializable {
    @SerializedName("idSubasta")
    private Long idSubasta;
    @SerializedName("fechaInicio")
    private Date fechaInicio;
    @SerializedName("fechaFin")
    private Date fechaFin;
    @SerializedName("estadoSubasta")
    private String estadoSubasta;
    @SerializedName("descripcionSubasta")
    private String descripcionSubasta;
    @SerializedName("imgSubasta")
    private String imgSubasta;
    @SerializedName("cliente")
    Cliente cliente = new Cliente();
    @SerializedName("servicio")
    Servicio servicio = new Servicio();
    @SerializedName("oferta")
    Oferta oferta = new Oferta();

    @SerializedName("calificacion")
    private Float calificacion;
    public Subasta() {
    }

    public Subasta(Long idSubasta, Date fechaInicio, Date fechaFin, String estadoSubasta, String descripcionSubasta, String imgSubasta, Cliente cliente, Servicio servicio, Oferta oferta, Float calificacion) {
        this.idSubasta = idSubasta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoSubasta = estadoSubasta;
        this.descripcionSubasta = descripcionSubasta;
        this.imgSubasta = imgSubasta;
        this.cliente = cliente;
        this.servicio = servicio;
        this.oferta = oferta;
        this.calificacion = calificacion;
    }

    public Long getIdSubasta() {
        return idSubasta;
    }

    public void setIdSubasta(Long idSubasta) {
        this.idSubasta = idSubasta;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstadoSubasta() {
        return estadoSubasta;
    }

    public void setEstadoSubasta(String estadoSubasta) {
        this.estadoSubasta = estadoSubasta;
    }

    public String getDescripcionSubasta() {
        return descripcionSubasta;
    }

    public void setDescripcionSubasta(String descripcionSubasta) {
        this.descripcionSubasta = descripcionSubasta;
    }

    public String getImgSubasta() {
        return imgSubasta;
    }

    public void setImgSubasta(String imgSubasta) {
        this.imgSubasta = imgSubasta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    public Float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Float calificacion) {
        this.calificacion = calificacion;
    }
}
