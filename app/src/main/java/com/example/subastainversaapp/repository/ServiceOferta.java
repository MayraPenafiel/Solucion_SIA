package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Oferta;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Date;

public interface ServiceOferta {
    @GET("/oferta/listar")
    Call<Oferta> listOferta();
    @GET("/oferta/listar/{id}")
    Call<Oferta> listOfertaId(@Path("id") Long id);
    @GET("/oferta/listar/{fecha}")
    Call<Oferta> listOfertaFecha(@Path("fecha") String fecha);
    @GET("/oferta/listar/{estado}")
    Call<Oferta> listOfertaEstado(@Path("estado") Boolean estado);
    @POST("/oferta/crear")
    Call<Oferta> createOferta(@Body Oferta oferta);
    @DELETE("/oferta/eliminar/{idOferta}")
    Call<Oferta> deleteSubasta(@Path("idOferta") String idOferta);
    @PUT("/oferta/editar/{idOferta}")
    Call<Oferta> editSubasta(@Path("idOferta") Long id,@Body Oferta oferta);
}