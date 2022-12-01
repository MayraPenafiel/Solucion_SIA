package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Servicio;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ServiceServicio {

    @GET("/servicio/listar")
    Call<List<Servicio>> listServicios();
    @GET("/servicio/listar_filtro/{filtro}")
    Call<List<Servicio>> listServiciosFiltro(@Path("filtro")String filtro);
    @PUT ("/servicio/editar/{idServicio}")
    Call<Servicio> editServicios(@Path("idServicio") Long id);
    @POST("/servicio/crear")
    Call<Servicio> createServicios(@Body Servicio servicio);
    @DELETE("/servicio/eliminar/{idServicio}")
    Call<Servicio> deleteService(@Path("idServicio") Long id);
}
