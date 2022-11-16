package com.example.subastainversaapp;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

public class ActivityRegistrarServicio extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ImageButton IbtnAgregar;

    Button btnAceptarServi;
    //array de ejemplo
    String[] categorias = {"Carpinteria","Electricidad","Mecanica",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_servicio);
        IbtnAgregar= (ImageButton) findViewById(R.id.IbtnAgregar);
        btnAceptarServi= (Button) findViewById(R.id.btnAceptarServi);
        //onClickListeners();

        //implementando el spinner
        Spinner spinn = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item,categorias);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinn.setAdapter(aa);

        //
        /*btnAceptarServi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityRegistrarServicio.this, DialogoAprovacionR.class));
            }
        });*/

        btnAceptarServi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                DialogoAprovacionR dc = new DialogoAprovacionR();
                dc.show(fm, "tagAlerta");
                //finish();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //se mostrara el menu en pantalla
        Toast.makeText(getApplicationContext(), categorias[position], Toast.LENGTH_LONG).show();
    }

    //AQUI AGREMAMOS EL CODIGO PARA GUARDAR DATOS
    private void onClickListeners() {
        //MOSTRAR VENTANA DE APROVACION
        btnAceptarServi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                DialogoAprovacionR dc = new DialogoAprovacionR();
                dc.show(fm, "tagAlerta");
                //finish();
            }
        });
    }
}