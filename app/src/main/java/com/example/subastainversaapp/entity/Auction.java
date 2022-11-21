package com.example.subastainversaapp.entity;

import java.util.Date;

public class Auction {

    private int id_auction;
    private Date fecha_inicio_auction;
    private Date fecha_fin_auction;
    private String estado_aucton;
    private String desc_auction;
    private int img_auction;

    public Auction() {
    }

    public Auction(int id_auction, Date fecha_inicio_auction, Date fecha_fin_auction, String estado_aucton, String desc_auction, int img_auction) {
        this.id_auction = id_auction;
        this.fecha_inicio_auction = fecha_inicio_auction;
        this.fecha_fin_auction = fecha_fin_auction;
        this.estado_aucton = estado_aucton;
        this.desc_auction = desc_auction;
        this.img_auction = img_auction;
    }

    public Auction(int img_auction, String estado_aucton) {
        this.img_auction=img_auction;
        this.estado_aucton=estado_aucton;
    }

    public Auction(String desc_auction) {
    }


    public int getId_auction() {
        return id_auction;
    }

    public void setId_auction(int id_auction) {
        this.id_auction = id_auction;
    }

    public Date getFecha_inicio_auction() {
        return fecha_inicio_auction;
    }

    public void setFecha_inicio_auction(Date fecha_inicio_auction) {
        this.fecha_inicio_auction = fecha_inicio_auction;
    }

    public Date getFecha_fin_auction() {
        return fecha_fin_auction;
    }

    public void setFecha_fin_auction(Date fecha_fin_auction) {
        this.fecha_fin_auction = fecha_fin_auction;
    }

    public String getEstado_aucton() {
        return estado_aucton;
    }

    public void setEstado_aucton(String estado_aucton) {
        this.estado_aucton = estado_aucton;
    }

    public String getDesc_auction() {
        return desc_auction;
    }

    public void setDesc_auction(String desc_auction) {
        this.desc_auction = desc_auction;
    }

    public int getImg_auction() {
        return img_auction;
    }

    public void setImg_auction(int img_auction) {
        this.img_auction = img_auction;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "id_auction=" + id_auction +
                ", fecha_inicio_auction=" + fecha_inicio_auction +
                ", fecha_fin_auction=" + fecha_fin_auction +
                ", estado_aucton='" + estado_aucton + '\'' +
                ", desc_auction='" + desc_auction + '\'' +
                ", img_auction='" + img_auction + '\'' +
                '}';
    }
}
