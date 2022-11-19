package com.example.subastainversaapp.repository;

import com.example.subastainversaapp.entity.Cliente;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ServiceCliente {
    @POST("/cliente/crear")
    Call<Cliente> createPost(@Body Cliente cliente);
}
