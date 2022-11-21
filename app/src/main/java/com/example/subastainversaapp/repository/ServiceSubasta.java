package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Subasta;
import retrofit2.Call;
import retrofit2.http.*;
import java.util.Date;

public interface ServiceSubasta {
    @GET("/subasta/listar")
    Call<Subasta> listSubasta();
    @GET("/subasta/listar/{filtro}") //filtro de cualquier campo de subasta
    Call<Subasta> listSubastaFiltro(@Path("filtro") String filtro);
    @GET("/subasta/listar/{fechaInicio}/{fechaFin}")
    Call<Subasta> listSubastaFiltroFechas(@Path("fechaInicio") Date fechaInicio, @Path("fechaFin") Date fechaFin);
    @POST("/subasta/crear")
    Call<Subasta> createSubasta(@Body Subasta subasta);
    @DELETE("/subasta/eliminar/{idSubasta}")
    Call<Subasta> deleteSubasta(@Path("idSubasta") String idSubasta);
    @PUT("/subasta/editar/{idSubasta}")
    Call<Subasta> editSubasta(@Path("idSubasta") Long id,@Body Subasta subasta);
}
