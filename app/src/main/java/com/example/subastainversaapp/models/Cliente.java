package com.example.subastainversaapp.models;

import com.google.gson.annotations.SerializedName;


public class Cliente extends Persona{

    @SerializedName("usuario")
    private Usuario usuario;
    
}
