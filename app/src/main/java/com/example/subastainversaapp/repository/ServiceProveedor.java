package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Proveedor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ServiceProveedor {
    @GET("/proveedor/listar")
    Call<List<Proveedor>> listProveedor();
    @GET("/proveedor/listar/{filtro}")//filtro de cualquier campo de proveedor
    Call<Proveedor> listProveedorFiltro(@Path("filtro") String filtro);
    @GET("/proveedor/listar/servicio/{servicio}") //servicio = nombre del servicio
    Call<Proveedor> listProveedorFiltroFechas(@Path("servicio") String servicio);
    @POST("/proveedor/crear")
    Call<Proveedor> createProveedor(@Body Proveedor proveedor);
    @DELETE("/proveedor/eliminar/{idProveedor}")
    Call<Proveedor> deleteProveedor(@Path("idProveedor") Long idProveedor);
    @PUT("/proveedor/editar/{idProveedor}")
    Call<Proveedor> editProveedor(@Path("idProveedor") Long idProveedor,@Body Proveedor proveedor);
}
