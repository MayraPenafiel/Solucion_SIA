package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Oferta;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ServiceOferta {
    @GET("/oferta/listar")
    Call<List<Oferta>> listOferta();
    @GET("/oferta/listar_id/{id}")
    Call<Oferta> listOfertaId(@Path("id") Long id);
    @GET("/oferta/listar_fecha/{fecha}")
    Call<Oferta> listOfertaFecha(@Path("fecha") String fecha);
    @GET("/oferta/listar_estado/{estado}")
    Call<Oferta> listOfertaEstado(@Path("estado") Boolean estado);
    @POST("/oferta/crear")
    Call<Oferta> createOferta(@Body Oferta oferta);
    @DELETE("/oferta/eliminar/{idOferta}")
    Call<Oferta> deleteSubasta(@Path("idOferta") String idOferta);
    @PUT("/oferta/editar/{idOferta}")
    Call<Oferta> editSubasta(@Path("idOferta") Long id,@Body Oferta oferta);
}
