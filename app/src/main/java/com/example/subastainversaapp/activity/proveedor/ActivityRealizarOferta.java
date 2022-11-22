package com.example.subastainversaapp.activity.proveedor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.entity.Oferta;
import com.example.subastainversaapp.entity.Subasta;
import com.example.subastainversaapp.repository.ServiceOferta;

import java.util.List;

public class ActivityRealizarOferta extends AppCompatActivity {

    List<Oferta> auctions;
    ServiceOferta oferta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizar_oferta);
    }
}