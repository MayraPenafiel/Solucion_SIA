package com.example.subastainversaapp.activity.proveedor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.subastainversaapp.Api.Apis;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.adapters.ListAdapterServicios;
import com.example.subastainversaapp.adapters.ListIniProvAdapter;
import com.example.subastainversaapp.entity.Servicio;
import com.example.subastainversaapp.entity.Subasta;
import com.example.subastainversaapp.repository.ServiceServicio;
import com.example.subastainversaapp.repository.ServiceSubasta;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.ArrayList;
import java.util.List;

public class ActivityInicioProveedor extends AppCompatActivity {

    private List<Servicio> subastas;
    private RecyclerView recyclerView;
    private ListAdapterServicios adapterSubastas;


    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment__servicios_config,container,false);
        recyclerView= view.findViewById(R.id.listaServicios);
        servicios= new ArrayList<>();

        //  cargarLista();
        mostrarDatos();
        return view;
    }

    public void mostrarDatos(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2:9090") //Url del emulador predeterminado
                .addConverterFactory(GsonConverterFactory.create()).build();

        // Call<List<Servicio>> call = api.listServicios();
        Call<List<Servicio>> call = retrofit.create(ServiceServicio.class).listServicios(); //Se llama el método predefinido en la Api para listar
        call.enqueue(new Callback<List<Servicio>>() {
            @Override
            public void onResponse(Call<List<Servicio>> call, Response<List<Servicio>> response) {
                if(response.isSuccessful()){
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    servicios=response.body();
                    adapterServicios= new ListAdapterServicios(servicios, getContext()); //Aquí la consulta ya debe realizarse a la base para poder mostrar los datos
                    recyclerView.setAdapter(adapterServicios);
                }
            }

            @Override
            public void onFailure(Call<List<Servicio>> call, Throwable t) {
                Toast.makeText(getContext(), "Error de Conexión al Servicio", Toast.LENGTH_SHORT).show();

            }
        });
    }








    /**/
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