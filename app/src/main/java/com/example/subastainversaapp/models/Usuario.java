package com.example.subastainversaapp.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Usuario implements Serializable {

    @SerializedName("usuario_id")
    private Long usuario_id;

    @SerializedName("nombreUsuario")
    private String nombreUsuario;
    @SerializedName("contrasenia_usuario")
    private String contraseniaUsuario;

    public Usuario() {
    }

    public Usuario(Long usuario_id, String nombreUsuario, String contraseniaUsuario) {
        this.usuario_id = usuario_id;
        this.nombreUsuario = nombreUsuario;
        this.contraseniaUsuario = contraseniaUsuario;
    }
}
