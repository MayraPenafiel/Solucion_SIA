package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Persona;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ServicePersona {
    @GET("/persona/listar")
    Call<Persona> listSubasta();
    @POST("/persona")
    Call<Persona> createSubasta(@Body Persona persona);
}
