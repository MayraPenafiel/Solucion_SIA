package com.example.subastainversaapp.activity;

import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.example.subastainversaapp.Apis;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.entity.Servicio;
import com.example.subastainversaapp.repository.ServiceServicio;

public class ActivityRegistrarServicio extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ImageButton IbtnAgregar;

    Button btnAceptarServicio;
    //array de ejemplo
    String[] categorias = {"Carpinteria","Electricidad","Mecanica"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_servicio);
        IbtnAgregar= (ImageButton) findViewById(R.id.IbtnAgregar);
        btnAceptarServicio= (Button) findViewById(R.id.btnAceptarServicio);
        //onClickListeners();

        Servicio responseServicio = new Servicio();
        ServiceServicio apiService = Apis.getInstance().create(ServiceServicio.class);


        //implementando el spinner
        Spinner spinn = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item,categorias);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinn.setAdapter(aa);

        //
        /*btnAceptarServi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), DialogoAprovacionR.class);
                startActivityForResult(intent, 0);
            }

        });*/

        btnAceptarServicio.setOnClickListener(new View.OnClickListener() {
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
        btnAceptarServicio.setOnClickListener(new View.OnClickListener() {
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