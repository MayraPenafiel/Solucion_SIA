package com.example.subastainversaapp.models;


//import io.swagger.annotations.ApiModelProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

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
}
