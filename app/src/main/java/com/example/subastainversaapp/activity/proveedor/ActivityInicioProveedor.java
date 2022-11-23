package com.example.subastainversaapp.activity.proveedor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.subastainversaapp.Apis;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.adapters.ListIniProvAdapter;
import com.example.subastainversaapp.entity.Subasta;
import com.example.subastainversaapp.repository.ServiceSubasta;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.ArrayList;
import java.util.List;

public class ActivityInicioProveedor extends AppCompatActivity {

    List<Subasta> auctions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_proveedor);
        init();
    }

    private void init()  {

        ArrayList<Object> ActionsList = new ArrayList<>();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Apis.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ServiceSubasta json = retrofit.create(ServiceSubasta.class);
        //Call<List<Producto>> call = json.productos();
        Call<Subasta> call = json.listSubasta();
        call.enqueue(new Callback<Subasta>() {
            @Override
            public void onResponse(Call<Subasta> call, Response<Subasta> response) {
                List<Subasta> post = (List<Subasta>) response.body();
                for (Subasta sub: post) {

                    sub.setFechaInicio(sub.getFechaInicio());
                    sub.setFechaFin(sub.getFechaFin());
                    System.out.println(sub.getFechaInicio().toString() + sub.getFechaFin().toString() + " NOMBRESSSSSS");
                    sub.setServicio(sub.getServicio());

                    ActionsList.add(sub);
                }
                System.out.println(ActionsList.size() + " iiiiiiiiiiiiiiiiiiiiiddddddd");


            }


            @Override
            public void onFailure(Call<Subasta> call, Throwable t) {

            }
        });

        RecyclerView recyclerView = findViewById(R.id.listaIniProv);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        ListIniProvAdapter listAdapter = new ListIniProvAdapter(auctions, this);
        recyclerView.setAdapter(listAdapter);


    }
   }