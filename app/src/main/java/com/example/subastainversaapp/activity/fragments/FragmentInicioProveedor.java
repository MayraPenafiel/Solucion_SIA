package com.example.subastainversaapp.activity.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.adapters.ListIniProvAdapter;
import com.example.subastainversaapp.api.Apis;
import com.example.subastainversaapp.entity.Subasta;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class FragmentInicioProveedor extends Fragment {

    RequestQueue queue;
    Button ofertar;
    private List<Subasta> subastas;
    private RecyclerView recyclerView;
    private ListIniProvAdapter adapterSubastas;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio_proveedor, container, false);

        queue = Volley.newRequestQueue(this.getContext());
 obtenerDatos();
        recyclerView = view.findViewById(R.id.listaIniProv);
        subastas = new ArrayList<>();
        //mostrarDatos();
        ofertar = view.findViewById(R.id.btfertariniprov);
        /*ofertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm =getActivity().getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.container,new FragmentRealizarOferta(),null);
                ft.commit();
            }
        });*/
        return view;
    }

    public void obtenerDatos() {
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, Apis.BASE_URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                int x = 0;
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                int x = 0;
            }
        });
    }
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

