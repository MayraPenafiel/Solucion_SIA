package com.example.subastainversaapp.entity;

import java.util.Date;

public class Offer {

    //Atributos
    private int id_offer;
    private String precio_offer;
    private String estado_offer;
    private Date fecha_calificacion;
    private Date fecha_oferta;
    private String desc_offer;
    private String puntos_calificacion;
    private String comentario_oferta;

    //Constructores

    public Offer() {
    }

    public Offer(int id_offer, String precio_offer, String estado_offer, Date fecha_calificacion, Date fecha_oferta, String desc_offer, String puntos_calificacion, String comentario_oferta) {
        this.id_offer = id_offer;
        this.precio_offer = precio_offer;
        this.estado_offer = estado_offer;
        this.fecha_calificacion = fecha_calificacion;
        this.fecha_oferta = fecha_oferta;
        this.desc_offer = desc_offer;
        this.puntos_calificacion = puntos_calificacion;
        this.comentario_oferta = comentario_oferta;
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

    public Date getFecha_calificacion() {
        return fecha_calificacion;
    }

    public void setFecha_calificacion(Date fecha_calificacion) {
        this.fecha_calificacion = fecha_calificacion;
    }

    public Date getFecha_oferta() {
        return fecha_oferta;
    }

    public void setFecha_oferta(Date fecha_oferta) {
        this.fecha_oferta = fecha_oferta;
    }

    public String getDesc_offer() {
        return desc_offer;
    }

    public void setDesc_offer(String desc_offer) {
        this.desc_offer = desc_offer;
    }

    public String getPuntos_calificacion() {
        return puntos_calificacion;
    }

    public void setPuntos_calificacion(String puntos_calificacion) {
        this.puntos_calificacion = puntos_calificacion;
    }

    public String getComentario_oferta() {
        return comentario_oferta;
    }

    public void setComentario_oferta(String comentario_oferta) {
        this.comentario_oferta = comentario_oferta;
    }

    //Metodo toString

    @Override
    public String toString() {
        return "Offer{" +
                "id_offer=" + id_offer +
                ", precio_offer='" + precio_offer + '\'' +
                ", estado_offer='" + estado_offer + '\'' +
                ", fecha_calificacion=" + fecha_calificacion +
                ", fecha_oferta=" + fecha_oferta +
                ", desc_offer='" + desc_offer + '\'' +
                ", puntos_calificacion='" + puntos_calificacion + '\'' +
                ", comentario_oferta='" + comentario_oferta + '\'' +
                '}';
    }
}
