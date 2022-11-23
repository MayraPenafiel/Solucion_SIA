package com.example.subastainversaapp.models;


//import io.swagger.annotations.ApiModelProperty;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Subasta {

    @SerializedName("id_subasta")
    private long idSubasta;

    @SerializedName("fecha_inicio_subasta")
    private Date fechaInicio;

    @SerializedName("fecha_fin_subasta")
    private Date fechaFin;

    @SerializedName("estado_subasta")
    private String estadoSubasta;

    @SerializedName("desc_subasta")
    private String descripcionSubasta;

    @SerializedName("img_subasta")
    private String imgSubasta;


    @SerializedName("id_cliente")
    private Cliente cliente;

    @SerializedName("id_servicio")
    private Servicio servicio;

    public Subasta() {
    }

    public Subasta(long idSubasta, Date fechaInicio, Date fechaFin, String estadoSubasta, String descripcionSubasta, String imgSubasta, Cliente cliente, Servicio servicio) {
        this.idSubasta = idSubasta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoSubasta = estadoSubasta;
        this.descripcionSubasta = descripcionSubasta;
        this.imgSubasta = imgSubasta;
        this.cliente = cliente;
        this.servicio = servicio;
    }


    public long getIdSubasta() {
        return idSubasta;
    }

    public void setIdSubasta(long idSubasta) {
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
}
