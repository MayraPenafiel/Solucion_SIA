package com.example.subastainversaapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityConfigurarPro extends AppCompatActivity {

    Button btnServicios, btnGuardarConCli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurar_pro);
        btnServicios= (Button) findViewById(R.id.btnServicios);
        //MOSTRARA LA VENTANA PARA AGREGAR SERVICIO
        btnServicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityConfigurarPro.this, ActivityServicios.class));
            }
        });

    }
}