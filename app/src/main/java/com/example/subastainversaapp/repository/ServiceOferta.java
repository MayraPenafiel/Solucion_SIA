package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Oferta;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ServiceOferta {
    @GET("/auth/oferta/listar")
    Call<Oferta> listOferta();
    @GET("/auth/oferta/listar/{id}")
    Call<Oferta> listOfertaId(@Path("id") Long id);
    @GET("/auth/oferta/listar/{fecha}")
    Call<Oferta> listOfertaFecha(@Path("fecha") String fecha);
    @GET("/auth/oferta/listar/{estado}")
    Call<Oferta> listOfertaEstado(@Path("estado") Boolean estado);
    @POST("/auth/oferta/crear")
    Call<Oferta> createOferta(@Body Oferta oferta);
    @DELETE("/auth/oferta/eliminar/{idOferta}")
    Call<Oferta> deleteSubasta(@Path("idOferta") String idOferta);
    @PUT("/auth/oferta/editar/{idOferta}")
    Call<Oferta> editSubasta(@Path("idOferta") Long id,@Body Oferta oferta);
}
