package com.example.subastainversaapp.entity;

public class Provider {
    private Long id_proveedor;
    private String anos_exp_proveedor;
    private String contrasena_proveedor;

    public Provider() {
    }

    public Provider(Long id_proveedor, String anos_exp_proveedor, String contrasena_proveedor) {
        this.id_proveedor = id_proveedor;
        this.anos_exp_proveedor = anos_exp_proveedor;
        this.contrasena_proveedor = contrasena_proveedor;
    }

    public Long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getAnos_exp_proveedor() {
        return anos_exp_proveedor;
    }

    public void setAnos_exp_proveedor(String anos_exp_proveedor) {
        this.anos_exp_proveedor = anos_exp_proveedor;
    }

    public String getContrasena_proveedor() {
        return contrasena_proveedor;
    }

    public void setContrasena_proveedor(String contrasena_proveedor) {
        this.contrasena_proveedor = contrasena_proveedor;
    }
}
