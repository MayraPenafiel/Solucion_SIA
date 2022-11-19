package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Servicio;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ServiceServicio {

    @GET("servicio/listar")
    Call<List<Servicio>> getServicios();
}
