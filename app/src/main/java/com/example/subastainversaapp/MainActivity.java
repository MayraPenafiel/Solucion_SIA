package com.example.subastainversaapp;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.subastainversaapp.activity.ActivityRecuperaC;

public class MainActivity extends AppCompatActivity {

    private TextView txtOlvidar_contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOlvidar_contrasena=findViewById(R.id.txtOlvidar_contrasena);

        txtOlvidar_contrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //METODO PARA CAMBIAR VENTANA
                Intent recuperarC = new Intent(MainActivity.this, ActivityRecuperaC.class);
                startActivity(recuperarC);
                finish();
            }
        });
    }


}