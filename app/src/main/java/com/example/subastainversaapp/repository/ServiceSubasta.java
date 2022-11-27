package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Subasta;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ServiceSubasta {
    @GET("/auth/subasta/listar")
    Call<Subasta> listSubasta();
    @GET("/auth/subasta/listar/{filtro}") //filtro de cualquier campo de subasta
    Call<Subasta> listSubastaFiltro(@Path("filtro") String filtro);
    @GET("/auth/subasta/listar/{fechaInicio}/{fechaFin}")
    Call<Subasta> listSubastaFiltroFechas(@Path("fechaInicio") String fechaInicio, @Path("fechaFin") String fechaFin);
    @POST("/auth/subasta/crear")
    Call<Subasta> createSubasta(@Body Subasta subasta);
    @DELETE("/auth/subasta/eliminar/{idSubasta}")
    Call<Subasta> deleteSubasta(@Path("idSubasta") String idSubasta);
    @PUT("/auth/subasta/editar/{idSubasta}")
    Call<Subasta> editSubasta(@Path("idSubasta") Long id,@Body Subasta subasta);
}
