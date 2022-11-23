package com.example.subastainversaapp.models;

import com.google.gson.annotations.SerializedName;


public class Cliente extends Persona{

    @SerializedName("usuario")
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
