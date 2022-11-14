package com.example.subastainversaapp.entity;

import java.util.Date;

public class Offer {

    //Atributos
    private int id_offer;
    private String precio_offer;
    private String estado_offer;
    private Date fecha_offer;
    private String desc_offer;

    //Constructores
    public Offer() {
    }

    public Offer(int id_offer, String precio_offer, String estado_offer, Date fecha_offer, String desc_offer) {
        this.id_offer = id_offer;
        this.precio_offer = precio_offer;
        this.estado_offer = estado_offer;
        this.fecha_offer = fecha_offer;
        this.desc_offer = desc_offer;
    }
    //Getter y setter

    public int getId_offer() {
        return id_offer;
    }

    public void setId_offer(int id_offer) {
        this.id_offer = id_offer;
    }

    public String getPrecio_offer() {
        return precio_offer;
    }

    public void setPrecio_offer(String precio_offer) {
        this.precio_offer = precio_offer;
    }

    public String getEstado_offer() {
        return estado_offer;
    }

    public void setEstado_offer(String estado_offer) {
        this.estado_offer = estado_offer;
    }

    public Date getFecha_offer() {
        return fecha_offer;
    }

    public void setFecha_offer(Date fecha_offer) {
        this.fecha_offer = fecha_offer;
    }

    public String getDesc_offer() {
        return desc_offer;
    }

    public void setDesc_offer(String desc_offer) {
        this.desc_offer = desc_offer;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Offer{" +
                "id_offer=" + id_offer +
                ", precio_offer='" + precio_offer + '\'' +
                ", estado_offer='" + estado_offer + '\'' +
                ", fecha_offer=" + fecha_offer +
                ", desc_offer='" + desc_offer + '\'' +
                '}';
    }
}
