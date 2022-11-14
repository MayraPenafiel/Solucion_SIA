package com.example.subastainversaapp.entity;

public class Service {

    //Atributos
    private int id_service;
    private String nombre_service;
    private String desc_service;

    //Constructores
    public Service() {
    }

    public Service(int id_service, String nombre_service, String desc_service) {
        this.id_service = id_service;
        this.nombre_service = nombre_service;
        this.desc_service = desc_service;
    }

    //Getters y setters

    public int getId_service() {
        return id_service;
    }

    public void setId_service(int id_service) {
        this.id_service = id_service;
    }

    public String getNombre_service() {
        return nombre_service;
    }

    public void setNombre_service(String nombre_service) {
        this.nombre_service = nombre_service;
    }

    public String getDesc_service() {
        return desc_service;
    }

    public void setDesc_service(String desc_service) {
        this.desc_service = desc_service;
    }


    //Metodo toString

    @Override
    public String toString() {
        return "Service{" +
                "id_service=" + id_service +
                ", nombre_service='" + nombre_service + '\'' +
                ", desc_service='" + desc_service + '\'' +
                '}';
    }
}
