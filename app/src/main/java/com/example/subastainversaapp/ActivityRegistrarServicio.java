package com.example.subastainversaapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityRegistrarServicio extends AppCompatActivity {

    ImageButton IbtnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_servicio);
        IbtnAgregar= (ImageButton) findViewById(R.id.IbtnAgregar);

        IbtnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityRegistrarServicio.this, DialogoAgregarServicio.class));
            }
        });
    }
}