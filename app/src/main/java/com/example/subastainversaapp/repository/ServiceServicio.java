package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Servicio;
import com.example.subastainversaapp.response.ResponseServicio;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ServiceServicio {

    @GET("/auth/servicio/listar")
    Call<List<Servicio>> listServicios();
    @PUT ("/auth/servicio/editar/{idServicio}")
    Call<Servicio> editServicios(@Path("idServicio") Long id);
    @POST("/auth/servicio/crear")
    Call<Servicio> createServicios(@Body Servicio servicio);
    @DELETE("/auth/servicio/eliminar/{idServicio}")
    Call<Servicio> deleteService(@Path("idServicio") Long id);
}
