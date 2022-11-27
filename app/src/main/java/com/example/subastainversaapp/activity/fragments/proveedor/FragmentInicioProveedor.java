package com.example.subastainversaapp.activity.fragments.proveedor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.adapters.ListIniProvAdapter;
import com.example.subastainversaapp.entity.Subasta;
import com.example.subastainversaapp.repository.ServiceSubasta;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.ArrayList;
import java.util.List;

public class FragmentInicioProveedor extends Fragment {

    private List<Subasta> subastas;
    private RecyclerView recyclerView;
    private ListIniProvAdapter adapterSubastas;


    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_inicio_proveedor,container,false);
        recyclerView= view.findViewById(R.id.listaSubastas);
        subastas= new ArrayList<>();

        //  cargarLista();
        mostrarDatos();
        return view;
    }

    public void mostrarDatos(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2:9090") //Url del emulador predeterminado
                .addConverterFactory(GsonConverterFactory.create()).build();

        // Call<List<Servicio>> call = api.listServicios();
        Call <List<Subasta>> call = retrofit.create(ServiceSubasta.class).listSubasta(); //Se llama el método predefinido en la Api para listar
        call.enqueue(new Callback<List<Subasta>>() {
            @Override
            public void onResponse(Call<List<Subasta>> call, Response<List<Subasta>> response) {
                if(response.isSuccessful()){
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    subastas=response.body();
                    adapterSubastas= new ListIniProvAdapter(subastas, getContext()); //Aquí la consulta ya debe realizarse a la base para poder mostrar los datos
                    recyclerView.setAdapter(adapterSubastas);
                }
            }

            @Override
            public void onFailure(Call<List<Subasta>> call, Throwable t) {
                Toast.makeText(getContext(), "Error de Conexión al Servicio", Toast.LENGTH_SHORT).show();

            }
        });
    }

   }