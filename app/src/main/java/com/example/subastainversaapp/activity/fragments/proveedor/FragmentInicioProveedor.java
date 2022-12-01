package com.example.subastainversaapp.activity.fragments.proveedor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.subastainversaapp.DiagoloAdvertenciaCli;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.activity.IComunicaProvOfert;
import com.example.subastainversaapp.adapters.ListIniProvAdapter;
import com.example.subastainversaapp.entity.Cliente;
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

public class FragmentInicioProveedor extends Fragment{

    private List<Subasta> subastas;
    private RecyclerView recyclerView;
    private ListIniProvAdapter adapterSubastas;

    Activity activity;
    IComunicaProvOfert iComunicaProvOfert;
    Button ofertar;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_inicio_proveedor,container,false);
        recyclerView= view.findViewById(R.id.listaIniProv);

       // onClickListener();
        subastas= new ArrayList<>();
        cargarDatos();
        mostrarDatos();

        return view;
    }


//    private void onClickListener() {
//
//        ofertar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                FragmentManager fm =getActivity().getSupportFragmentManager();
////                FragmentTransaction ft=fm.beginTransaction();
////                ft.replace(R.id.container,new FragmentRealizarOferta(),null);
////                ft.commit();
//            }
//        });
//
//    }

    public void cargarDatos(){
        Cliente cliente = new Cliente();
        subastas.add(new Subasta(null,null,null,"Activa","Arreglar un mueble","","Carpintería","Cindy Cedillo"));
        subastas.add(new Subasta(null,null,null,"Activa","Arreglar un mueble","","Carpintería","Cindy Cedillo"));
        subastas.add(new Subasta(null,null,null,"Activa","Arreglar un mueble","","Carpintería","Cindy Cedillo"));

    }

    public void mostrarDatos(){
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterSubastas= new ListIniProvAdapter(subastas, getContext()); //Aquí la consulta ya debe realizarse a la base para poder mostrar los datos
        recyclerView.setAdapter(adapterSubastas);
        adapterSubastas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iComunicaProvOfert.enviarDetSubasta(subastas.get(recyclerView.getChildAdapterPosition(v)));
            }
        });

    }

    /*public void mostrarDatos(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2:9090") //Url del emulador predeterminado
                .addConverterFactory(GsonConverterFactory.create()).build();

        // Call<List<Servicio>> call = api.listServicios();
        ServiceSubasta api = retrofit.create(ServiceSubasta.class);
        Call <List<Subasta>> call = api.listSubasta(); //Se llama el método predefinido en la Api para listar
        call.enqueue(new Callback<List<Subasta>>() {
            @Override
            public void onResponse(Call<List<Subasta>> call, Response<List<Subasta>> response) {
                Log.e(" Oferta","entra");
                Log.e(" SUbasta Contexto",getContext().toString());
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    subastas=response.body();
                    adapterSubastas= new ListIniProvAdapter(subastas, getContext()); //Aquí la consulta ya debe realizarse a la base para poder mostrar los datos
                    recyclerView.setAdapter(adapterSubastas);

            }

            @Override
            public void onFailure(Call<List<Subasta>> call, Throwable t) {
                Toast.makeText(getContext(), "Error de extracción de Subastas", Toast.LENGTH_SHORT).show();

            }
        });
    }*/

    @Override
    public void onAttach(@NonNull @NotNull Context context) {
        super.onAttach(context);
        if(context instanceof Activity){
            this.activity=(Activity) context;
            iComunicaProvOfert= (IComunicaProvOfert) this.activity;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}