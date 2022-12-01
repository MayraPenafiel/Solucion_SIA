package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Subasta;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Date;
import java.util.List;

public interface ServiceSubasta {

    @GET("/auth/subasta/listar/")
    Call<List<Subasta>> listSubasta();
    @GET("/auth/subasta/listar/filtro/{filtro}") //filtro de cualquier campo de subasta
    Call<List<Subasta>> listSubastaFiltro(@Path("filtro") String filtro);
    @GET("/auth/subasta/listar/fecha/{fechaInicio}/{fechaFin}")
    Call<List<Subasta>> listSubastaFiltroFechas(@Path("fechaInicio") Date fechaInicio, @Path("fechaFin") Date fechaFin);
    @POST("/auth/subasta/crear")
    Call<Subasta> createSubasta(@Body Subasta subasta);
    @DELETE("/auth/subasta/eliminar/{idSubasta}")
    Call<Subasta> deleteSubasta(@Path("idSubasta") String idSubasta);
    @PUT("/auth/subasta/editar/{idSubasta}")
    Call<Subasta> editSubasta(@Path("idSubasta") Long id,@Body Subasta subasta);
}
