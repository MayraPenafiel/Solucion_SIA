package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Proveedor;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ServiceProveedor {
    @GET("/auth/proveedor/listar")
    Call<List<Proveedor>> listProveedor();
    @GET("/auth/proveedor/listar_filtro/{filtro}")//filtro de cualquier campo de proveedor
    Call<List<Proveedor>> listProveedorFiltro(@Path("filtro") String filtro);
    @GET("/auth/proveedor/listar/servicio/{servicio}") //servicio = nombre del servicio
    Call<List<Proveedor>> listProveedorFiltroFechas(@Path("servicio") String servicio);
    @POST("/auth/proveedor/crear")
    Call<Proveedor> createProveedor(@Body Proveedor proveedor);
    @DELETE("/auth/proveedor/eliminar/{idProveedor}")
    Call<Proveedor> deleteProveedor(@Path("idProveedor") Long idProveedor);
    @PUT("/auth/proveedor/editar/{idProveedor}")
    Call<Proveedor> editProveedor(@Path("idProveedor") Long idProveedor,@Body Proveedor proveedor);
}
