package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Cliente;
import com.example.subastainversaapp.entity.ResponsesClassUsuario;
import com.example.subastainversaapp.entity.Usuario;
import retrofit2.Call;
import retrofit2.http.*;

public interface ServiceUsuario {

    @GET("/usuario/listar")
    Call<Usuario> listUsuario();

    @POST("/usuario/crear")
    Call<ResponsesClassUsuario> createUsuario(@Body Usuario responseRegisterClass);
    @DELETE("/usuario/eliminar/{idUsuario}")
    Call<Cliente> deleteUsuario(@Path("idUsuario") Long id);
    @PUT("/usuario/editar/{idUsuario}")
    Call<Cliente> editUsuario(@Path("idUsuario") Long id,@Body Usuario usuario);
}
