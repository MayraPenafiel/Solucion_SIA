package com.example.subastainversaapp.models;

//import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class Oferta implements Serializable {
    @SerializedName("idOferta")
    private Long idOferta;
    @SerializedName("precioOferta")
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion_oferta() {
        return descripcion_oferta;
    }

    public void setDescripcion_oferta(String descripcion_oferta) {
        this.descripcion_oferta = descripcion_oferta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
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
