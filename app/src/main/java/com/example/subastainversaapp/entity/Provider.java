package com.example.subastainversaapp.entity;

public class Provider {
    private Long id_proveedor;
    private String anos_exp_proveedor;

    public Provider() {
    }

    public Provider(Long id_proveedor, String anos_exp_proveedor) {
        this.id_proveedor = id_proveedor;
        this.anos_exp_proveedor = anos_exp_proveedor;
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

    @Override
    public String toString() {
        return "Provider{" +
                "id_proveedor=" + id_proveedor +
                ", anos_exp_proveedor='" + anos_exp_proveedor + '\'' +
                '}';
    }
}