package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Servicio;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ServiceServicio {

    @GET("/auth/servicio/listar")
    Call<List<Servicio>> listServicios();
    @GET("/auth/servicio/listar_filtro/{filtro")
    Call<List<Servicio>> listServiciosFiltro(@Path("filtro") String filtro);
    @PUT ("/auth/servicio/editar/{idServicio}")
    Call<Servicio> editServicios(@Path("idServicio") Long id, @Body Servicio servicio);
    @POST("/auth/servicio/crear")
    Call<Servicio> createServicios(@Body Servicio servicio);
    @DELETE("/auth/servicio/eliminar/{idServicio}")
    Call<Servicio> deleteService(@Path("idServicio") Long id);
}
