package com.example.subastainversaapp.activity.proveedor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.adapters.ListIniProvAdapter;
import com.example.subastainversaapp.entity.Subasta;
import com.example.subastainversaapp.repository.ServiceSubasta;

import java.util.ArrayList;
import java.util.List;

public class ActivityInicioProveedor extends AppCompatActivity {

    List<Subasta> auctions;
    ServiceSubasta subasta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_proveedor);
        init();
    }

    public void init(){
        auctions= new ArrayList<Subasta>();


        auctions.add(new Subasta());
        auctions.add(new Subasta());

        RecyclerView recyclerView = findViewById(R.id.listaIniProv);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        ListIniProvAdapter listAdapter = new ListIniProvAdapter(auctions, this);
        recyclerView.setAdapter(listAdapter);

    }
}