package com.example.subastainversaapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

public class ActivityCrearProveedor extends AppCompatActivity {

    Button btnCrearProveedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_proveedor);
        btnCrearProveedor= (Button) findViewById(R.id.btnCrearProveedor);
        onClickListeners();
    }

    private void onClickListeners() {
        btnCrearProveedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*FragmentManager fm = getSupportFragmentManager();
                DialogoAprovacionR dc = new DialogoAprovacionR();
                dc.show(fm, "tagAlerta");*/
                startActivity(new Intent(ActivityCrearProveedor.this, ActivityRegistrarServicio.class));
            }
        });
    }
}