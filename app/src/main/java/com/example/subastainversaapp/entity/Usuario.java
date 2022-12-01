package com.example.subastainversaapp.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Usuario implements Serializable {
    @SerializedName("usuario_id")
    private Long usuario_id;

    @SerializedName("nombreUsuario")
    private String nombreUsuario;

    @SerializedName("contrasenia_usuario")
    private String contraseniaUsuario;

    @SerializedName("rol_id")
    private Set<Rol> roles = new HashSet<>();

    public Usuario() {
    }

    public Usuario( String nombreUsuario, String contraseniaUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.contraseniaUsuario = contraseniaUsuario;
    }

    public Usuario(Long usuario_id, String nombreUsuario, String contraseniaUsuario, Set<Rol> roles) {
        this.usuario_id = usuario_id;
        this.nombreUsuario = nombreUsuario;
        this.contraseniaUsuario = contraseniaUsuario;
        this.roles = roles;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
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

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
}
