package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.ResponsesClassUsuario;
import com.example.subastainversaapp.entity.Usuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ServiceUsuario {

    @GET("/usuario/listar")
    Call<Usuario> find(@Path("id") String id);

    @POST("/api//crearcliente")
    Call<Usuario> createPost(@Body Usuario cliente);

    @POST("/api/getUser")
    Call<ResponsesClassUsuario> getUser(@Body Usuario responseRegisterClass);
}
