package com.example.subastainversaapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.example.subastainversaapp.DiagoloAdvertenciaCli;

public class ActivityConfigurarCli extends AppCompatActivity {

    Button btnGuardarConCli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurar_cli);
        onClickListeners();
    }

    //AQUI AGREGAMOS EL CODIGO PARA GUARDAR
    private void onClickListeners() {
        //MOSTRAR VENTANA DE APROVACION
        btnGuardarConCli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                DiagoloAdvertenciaCli dcd = new DiagoloAdvertenciaCli();
                dcd.show(fm, "tagAlerta");
            }
        });

    }
}