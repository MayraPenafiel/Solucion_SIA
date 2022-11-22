package com.example.subastainversaapp.models;

//import io.swagger.annotations.ApiModelProperty;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Servicio implements Serializable {

    @SerializedName("id_servicio")
    private long idServicio;
    @SerializedName("nombre_servicio")
    private String nombreServicio;
    @SerializedName("descripcion_servicio")
    private String descripcion_servicio;

    public Servicio() {

    }

    public Servicio(long idServicio, String nombreServicio, String descripcion_servicio) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.descripcion_servicio = descripcion_servicio;
    }
}
