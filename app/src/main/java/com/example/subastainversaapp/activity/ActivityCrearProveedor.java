package com.example.subastainversaapp.activity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.subastainversaapp.sqlite.DBHelper;
import com.example.subastainversaapp.sqlite.InsertsDBHelper;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.repository.DBHelper;

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

        txt_NombreProv =  findViewById(R.id.txtNombreP);
        txt_ApellidoProv =  findViewById(R.id.txtApellidoP);
        txt_CorreoP =  findViewById(R.id.txtCorreoP);
        txt_TelefonoProv =  findViewById(R.id.txtTelefonoP);
        txt_DireccionProv =  findViewById(R.id.txtDireccionP);
        txtContraseniaProv = findViewById(R.id.txtContraP);
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