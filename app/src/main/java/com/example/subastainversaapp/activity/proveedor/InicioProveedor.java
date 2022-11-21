package com.example.subastainversaapp.activity.proveedor;

import android.content.Intent;
import android.media.Image;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.adapters.ListIniProvAdapter;
import com.example.subastainversaapp.entity.Auction;

import java.util.ArrayList;
import java.util.List;

public class InicioProveedor extends AppCompatActivity {

    List<Auction> auctions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_proveedor);
        init();

        //int[]imageId ={R.drawable._10_star,R.drawable.caja_de_herramientas};
        //String[]servicios={"Cocina","Medicina"};
    }

    public void init(){
        auctions= new ArrayList<>();

        auctions.add(new Auction("Cocina"));
        auctions.add(new Auction("Madera"));

        RecyclerView recyclerView = findViewById(R.id.listaIniProv);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        ListIniProvAdapter listAdapter = new ListIniProvAdapter(auctions, this);
        recyclerView.setAdapter(listAdapter);

    }
}