package com.example.subastainversaapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class DialogoAgregarServicio extends AppCompatActivity implements AdapterView.OnItemClickListener {

    //array de ejemplo
    String[] categorias = {"Carpinteria","Electricidad","Mecanica",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogo_agregar_servicio);

        //implementando el spinner
        Spinner spinn = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item,categorias);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinn.setAdapter(aa);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //se mostrara el menu en pantalla
        Toast.makeText(getApplicationContext(), categorias[position], Toast.LENGTH_LONG).show();
    }
}