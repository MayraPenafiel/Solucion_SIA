package com.example.subastainversaapp;


import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

import com.example.subastainversaapp.api.Apis;
import com.example.subastainversaapp.entity.Servicio;
import android.widget.ArrayAdapter;
import com.example.subastainversaapp.repository.ServiceServicio;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.ArrayList;
import java.util.List;

public class ActivityRegistrarServicio extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ImageButton IbtnAgregar;

    Button btnAceptarServicio;
    //array de ejemplo


    ArrayList<String> nombresServicio = new ArrayList<>();

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

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,nombresServicio);
       /* arrayAdapter.add();*/
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinn.setAdapter(arrayAdapter);

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
        Toast.makeText(getApplicationContext(), nombresServicio.get(position), Toast.LENGTH_LONG).show();
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
    private void getPosts() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.104:9090")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ServiceServicio postService = retrofit.create(ServiceServicio.class);
        Call< List<Servicio> > call = postService.listServicios();

        call.enqueue(new Callback<List<Servicio>>() {
            @Override
            public void onResponse(Call<List<Servicio>> call, Response<List<Servicio>> response) {
                for(Servicio post : response.body()) {
                    nombresServicio.add(post.getNombreServicio());
                }
/*
                runOnUiThread();
                arrayAdapter.notifyDataSetChanged();

 */
            }

            @Override
            public void onFailure(Call<List<Servicio>> call, Throwable t) {
            }
        });
    }
}