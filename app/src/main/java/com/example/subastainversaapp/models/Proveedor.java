package com.example.subastainversaapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Proveedor extends Persona {

    @SerializedName("anios_exp")
    private String anios_experiencia;

    @SerializedName("id_usuario")
    private Usuario usuario;

    @SerializedName( "id_servicio")
    private List<Servicio> servicios = new ArrayList<>();

}
