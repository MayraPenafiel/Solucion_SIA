package com.example.subastainversaapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.subastainversaapp.R;
import com.example.subastainversaapp.sqlite.DBHelper;
import com.example.subastainversaapp.sqlite.InsertsDBHelper;

public class ActivityCrearProveedor extends AppCompatActivity {

    Button btnCrearProveedor;
    String nombre, correo, oferta, dubsas, isd;
    EditText txt_NombreProv, txt_ApellidoProv, txt_CorreoP, txt_TelefonoProv,
            txt_DireccionProv, txtContraseniaProv, txtRepContraseniaProv;
    DBHelper dbHelper = new DBHelper(getBaseContext());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_proveedor);
        btnCrearProveedor= (Button) findViewById(R.id.btnCrearProveedor);

        txt_NombreProv =  findViewById(R.id.txtNombreC);
        txt_ApellidoProv =  findViewById(R.id.txtApellidoC);
        txt_CorreoP =  findViewById(R.id.txtCorreoC);
        txt_TelefonoProv =  findViewById(R.id.txtTelefonoC);
        txt_DireccionProv =  findViewById(R.id.txtDireccionC);
        txtContraseniaProv = findViewById(R.id.txtContraC);
        txtRepContraseniaProv =  findViewById(R.id.txtRepetirC);

        onClickListeners();
    }

    //AQUI AGREGAMOS EL CODIGO PARA GUARDAR
    private void onClickListeners() {
        //MOSTRARA LA VENTANA PARA AGREGAR SERVICIO
        btnCrearProveedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //GUARDAMOS INFORMACIÓN EN LA BASE DE DATOS PARA QUE AL MOMENTO DE AGREGAR SERVIO BUSQUE LA DATA Y CREE
                InsertsDBHelper save = new InsertsDBHelper(ActivityCrearProveedor.this);
                save.insertRProveedor(txt_NombreProv.getText().toString(), txt_ApellidoProv.getText().toString(), txt_CorreoP.getText().toString(),txt_TelefonoProv.getText().toString(),txt_DireccionProv.getText().toString(),txtContraseniaProv.getText().toString());
                startActivity(new Intent(ActivityCrearProveedor.this, ActivityRegistrarServicio.class));
            }
        });
    }


}