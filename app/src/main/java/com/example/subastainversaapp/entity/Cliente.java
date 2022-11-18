package com.example.subastainversaapp.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Cliente implements Serializable {
    @SerializedName("id_cliente")
        private Long id_cliente;
    @SerializedName("id_persona")
        private String id_persona;

    @SerializedName("usuario_id")
    private String usuario_id;

    public Cliente(Long id_cliente, String id_persona, String usuario_id) {
        this.id_cliente = id_cliente;
        this.id_persona = id_persona;
        this.usuario_id = usuario_id;
    }

    public String getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(String usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public Cliente() {
        }

        public Long getId_cliente() {
            return id_cliente;
        }

        public void setId_cliente(Long id_cliente) {
            this.id_cliente = id_cliente;
        }

    }


