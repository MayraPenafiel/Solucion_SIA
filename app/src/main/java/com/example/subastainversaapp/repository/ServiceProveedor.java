package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Proveedor;
import com.example.subastainversaapp.entity.Subasta;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Date;
import java.util.List;

public interface ServiceProveedor {
    @GET("/proveedor/listar")
    Call<List<Proveedor>> listProveedor();
    @GET("/proveedor/listar/{filtro}")//filtro de cualquier campo de proveedor
    Call<List<Proveedor>> listProveedorFiltro(@Path("filtro") String filtro);
    @GET("/proveedor/listar/servicio/{servicio}") //servicio = nombre del servicio
    Call<Proveedor> listSubastaFiltroFechas(@Path("servicio") String servicio);
    @POST("/proveedor/crear")
    Call<Proveedor> createSubasta(@Body Proveedor proveedor);
    @DELETE("/proveedor/eliminar/{idProveedor}")
    Call<Proveedor> deleteSubasta(@Path("idProveedor") Long idProveedor);
    @PUT("/proveedor/editar/{idProveedor}")
    Call<Proveedor> editSubasta(@Path("idProveedor") Long idProveedor,@Body Proveedor proveedor);
}
