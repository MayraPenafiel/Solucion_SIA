package com.example.subastainversaapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConnectionRest {
    private static Retrofit retrofit = null;
    private static final String  RUTA_API="http://10.0.2.2:8080";

    public static Retrofit getConnetion(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(RUTA_API).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return  retrofit;
    }

}
