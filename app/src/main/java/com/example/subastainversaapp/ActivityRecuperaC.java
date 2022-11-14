package com.example.subastainversaapp;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

public class ActivityRecuperaC extends AppCompatActivity {

    Button btnDiacorreo, btnCodigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recupera_c);
        btnDiacorreo= (Button) findViewById(R.id.btnDiacorreo);
        btnCodigo= (Button) findViewById(R.id.btnCodigo);
        //METODO PARA VALIDAR EL CORREO DE LA VENTANA DE DIALOGO.
        btnDiacorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                DialogoCorreoV dc = new DialogoCorreoV();
                dc.show(fm, "tagAlerta");
            }
        });

        //METODO PARA VALIDAR EL CODIGO DE LA VENTANA DE DIALOGO
        btnCodigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                DialogoCorreoV dc = new DialogoCorreoV();
                dc.show(fm, "tagAlerta");
            }
        });

    }


}