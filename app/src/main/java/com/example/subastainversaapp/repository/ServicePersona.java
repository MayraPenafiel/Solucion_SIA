package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Persona;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;

public interface ServicePersona {
    @GET("/persona/listar")
    Call<List<Persona>> listSubasta();
    @POST("/persona/crear")
    Call<Persona> createSubasta(@Body Persona persona);
}
