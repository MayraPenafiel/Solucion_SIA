package com.example.subastainversaapp;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

public class ActivityRecuperaC extends AppCompatActivity {

    Button btnValidar, btnEnviar_codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recupera_c);
        btnEnviar_codigo= (Button) findViewById(R.id.btnEnviar_codigo);
        btnValidar= (Button) findViewById(R.id.btnValidar);
        //METODO PARA VALIDAR EL CORREO DE LA VENTANA DE DIALOGO.
        btnEnviar_codigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                DialogoCorreoV dc = new DialogoCorreoV();
                dc.show(fm, "tagAlerta");
            }
        });

        //METODO PARA VALIDAR EL CODIGO DE LA VENTANA DE DIALOGO
        btnValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                DialogoCodigo dco = new DialogoCodigo();
                dco.show(fm, "tagAlerta");
            }
        });

    }


}