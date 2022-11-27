package com.example.subastainversaapp.models;

//import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class Oferta implements Serializable {
    @SerializedName("id_oferta")
    private Long idOferta;
    @SerializedName("percio_oferta")
    private Double percioOferta;
    @SerializedName("fecha_oferta")
    private Date fecha;
    @SerializedName( "descripcion_oferta")
    private String descripcion_oferta;
    @SerializedName("estado_oferta")
    private boolean estado;

    @SerializedName("id_proveedor")
    private Proveedor proveedor;
    @SerializedName("id_subasta")
    private Subasta subasta;

    public Oferta(Long idOferta, Double percioOferta, Date fecha, String descripcion_oferta, boolean estado, Proveedor proveedor, Subasta subasta) {
        this.idOferta = idOferta;
        this.percioOferta = percioOferta;
        this.fecha = fecha;
        this.descripcion_oferta = descripcion_oferta;
        this.estado = estado;
        this.proveedor = proveedor;
        this.subasta = subasta;
    }

    public Oferta() {
    }
}
