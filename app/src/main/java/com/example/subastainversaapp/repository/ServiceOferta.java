package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Oferta;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ServiceOferta {
    @GET("/auth/oferta/listar")
    Call<List<Oferta>> listOferta();
    @GET("/auth/oferta/listar/subasta/{idSubasta}")
    Call<List<Oferta>> listOfertaSubasta(@Path("idSubasta") Long id);
    @POST("/auth/oferta/crear")
    Call<Oferta> createOferta(@Body Oferta oferta);
    @PUT("/auth/oferta/editar/{idOferta}")
    Call<Oferta> editSubasta(@Path("idOferta") Long id,@Body Oferta oferta);
    @DELETE("/auth/oferta/eliminar/{idOferta}")
    Call<Oferta> deleteSubasta(@Path("idOferta") Long idOferta);
    @GET("/auth/auth/oferta/listar/id/{id}")
    Call<List<Oferta>> listOfertaId(@Path("id") Long id);
    @GET("/auth/oferta/listar/fecha/{fecha}")
    Call<List<Oferta>>listOfertaFecha(@Path("fecha") String fecha);
    @GET("/auth/oferta/listar/estado/{estado}")
    Call<List<Oferta>> listOfertaEstado(@Path("estado") Boolean estado);
    @GET("/auth/oferta/listar/proveedor/{proveedor}")
    Call<List<Oferta>> listOfertaProveedor(@Path("proveedor") Long proveedor);
    @GET("/auth/oferta/listar/calificacion/{califiacion:.*}")
    Call<List<Oferta>> listOfertaProveedor(@Path("califiacion") Double califiacion);

}
