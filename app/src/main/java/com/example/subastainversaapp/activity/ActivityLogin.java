package com.example.subastainversaapp.activity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.subastainversaapp.ActivityCrearCliente;
import com.example.subastainversaapp.ActivityCrearProveedor;
import com.example.subastainversaapp.R;

public class ActivityLogin extends AppCompatActivity {

    TextView txtOlvidar_contrasena,txtCrear_cuenta,txtCear_provedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtOlvidar_contrasena=findViewById(R.id.txtOlvidar_contrasena);
        txtCrear_cuenta=findViewById(R.id.txtCrear_cuenta);
        txtCear_provedor=findViewById(R.id.txtCear_provedor);

        txtOlvidar_contrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //METODO PARA CAMBIAR VENTANA
                Intent recuperarC = new Intent(ActivityLogin.this, ActivityRecuperaC.class);
                startActivity(recuperarC);
                //finish();
                //startActivity(new Intent(ActivityLogin.this, ActivityRecuperaC.class));
           }
        });

        txtCrear_cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityLogin.this, ActivityCrearCliente.class));
            }
        });

        txtCear_provedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityLogin.this, ActivityCrearProveedor.class));
            }
        });
    }
}