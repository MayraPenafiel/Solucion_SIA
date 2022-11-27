package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Proveedor;
import com.example.subastainversaapp.entity.Subasta;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Date;
import java.util.List;

public interface ServiceProveedor {
    @GET("/auth/proveedor/listar")
    Call<Proveedor> listProveedor();
    @GET("/auth/proveedor/listar/{filtro}")//filtro de cualquier campo de proveedor
    Call<List<Proveedor>> listProveedorFiltro(@Path("filtro") String filtro);
    @GET("/auth/proveedor/listar/servicio/{servicio}") //servicio = nombre del servicio
    Call<Proveedor> listSubastaFiltroFechas(@Path("servicio") String servicio);
    @POST("/auth/proveedor/crear")
    Call<Proveedor> createSubasta(@Body Proveedor proveedor);
    @DELETE("/auth/proveedor/eliminar/{idProveedor}")
    Call<Proveedor> deleteSubasta(@Path("idProveedor") Long idProveedor);
    @PUT("/auth/proveedor/editar/{idProveedor}")
    Call<Proveedor> editSubasta(@Path("idProveedor") Long idProveedor,@Body Proveedor proveedor);
}
