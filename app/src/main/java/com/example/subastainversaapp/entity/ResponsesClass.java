package com.example.subastainversaapp.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ResponsesClass implements Serializable {
    @SerializedName("usuario_id")
    private int usuario_id;

    @SerializedName("nombreUsuario")
    private String nombreUsuario;

    @SerializedName("contraseniaUsuario")
    private String contraseniaUsuario;

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseniaUsuario() {
        return contraseniaUsuario;
    }

    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }

    @Override
    public String toString() {
        return
                "ResponsesClass{" +
                        "usuario_id = '" + usuario_id + '\'' +
                        ",nombreUsuario = '" + nombreUsuario + '\'' +
                        ",contraseniaUsuario = '" + contraseniaUsuario + '\'' +
                        "}";
    }
}
