package com.example.subastainversaapp.activity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.sqlite.DBHelper;

public class ActivityCrearProveedor extends AppCompatActivity {

    Button btnCrearProveedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_proveedor);
        btnCrearProveedor= (Button) findViewById(R.id.btnCrearProveedor);
        onClickListeners();
    }

    //AQUI AGREGAMOS EL CODIGO PARA GUARDAR
    private void onClickListeners() {
        //MOSTRARA LA VENTANA PARA AGREGAR SERVICIO
        btnCrearProveedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbHelper = new DBHelper(ActivityCrearProveedor.this);
                SQLiteDatabase dbsql = dbHelper.getWritableDatabase();
                if(dbsql!=null){
                    Toast.makeText(ActivityCrearProveedor.this, "Error en la Base de Datos SQLITE", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ActivityCrearProveedor.this, "Datos Guardado en la Base de Datos Local", Toast.LENGTH_SHORT).show();
                };

                startActivity(new Intent(ActivityCrearProveedor.this, ActivityRegistrarServicio.class));
            }
        });
    }
}