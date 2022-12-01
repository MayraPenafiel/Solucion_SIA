package com.example.subastainversaapp.activity.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.adapters.ListIniProvAdapter;
import com.example.subastainversaapp.api.Apis;
import com.example.subastainversaapp.entity.Cliente;
import com.example.subastainversaapp.entity.Servicio;
import com.example.subastainversaapp.entity.Subasta;
import com.example.subastainversaapp.entity.Usuario;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FragmentInicioProveedor extends Fragment {

    Button ofertar;
    private List<Servicio> sub;
    RequestQueue queue;
    private List<Subasta> subastas;

    ArrayAdapter<String> arrayAdapter;
    ArrayList <String>  datos = new ArrayList<>();
    EditText txtuser;
    private RecyclerView recyclerView;
    private ListIniProvAdapter adapterSubastas;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_inicio_proveedor, container, false);
        recyclerView = view.findViewById(R.id.listaIniProv);
        subastas = new ArrayList<>();
//        mostrarDatos();

        queue = Volley.newRequestQueue(this.getContext());
        obtenerDatos();
        txtuser= view.findViewById(R.id.edtTextUsuario);
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
        JsonArrayRequest request = new JsonArrayRequest(Apis.BASE_URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                pasarJSon(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(),error.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }
    private void pasarJSon(JSONArray array){
        datos.add("_____________________________________________");

        int y=0;
        //do {
            for (int i = 0; i <= array.length(); i++) {
                JSONObject json;
                Subasta sub = new Subasta();
                Servicio ser = new Servicio();
                Cliente cli = new Cliente();
                Usuario user = new Usuario();

                try {
                    //Setear Clases con los datos del Web service
                    json = array.getJSONObject(i);
                    sub.setIdSubasta(json.getLong("id_subasta"));
                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    Date f_in, f_fin;
                    try {
                        f_in = format.parse(json.getJSONObject("fecha_inicio_subasta").toString());
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        f_fin = format.parse(json.getJSONObject("fecha_fin_subasta").toString());
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    sub.setFechaInicio(f_in);
                    sub.setFechaFin(f_fin);
                    Long h = ser.getIdServicio();

                    if (h == json.getLong("id_servicio")) {
                        sub.setServicio(ser);
                    } else {
                        sub.setServicio(null);
                        System.out.println("No existe un servicio");
                    }
                    String u = user.getNombreUsuario();
                    String c = cli.getEmail();
                    Long cl = cli.getUsuario().getUsuario_id();
                    if (json.getString("id_cliente") == cl.toString()) {
                        sub.setCliente(cli);
                    }
                    sub.setDescripcionSubasta(json.getString("desc_subasta"));
                    sub.setImgSubasta(json.getString("img_subasta"));
                    sub.setEstadoSubasta(json.getString("estado_subasta"));


                    //Agregar datos al arrayList enlazado con la lista de la vista
                    datos.add("ID: " + sub.getIdSubasta() + "");
                    datos.add("Cliente: " + sub.getCliente().getNombre() + sub.getCliente().getApellido());
                    datos.add("Fecha_inicio: " + sub.getFechaInicio());
                    datos.add("Imagen: " + sub.getImgSubasta());
                    datos.add("Fecha_fin: " + sub.getFechaFin());
                    datos.add("Servicio: " + sub.getServicio().getNombreServicio());
                    datos.add("Estado: " + sub.getEstadoSubasta());
                    datos.add("Descripcion: " + sub.getDescripcionSubasta());
                    datos.add("_____________________________________________");


                    if (user.getNombreUsuario() == txtuser.getText().toString()) {
                        y = 15;
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }
                arrayAdapter.notifyDataSetChanged();
                System.out.println(datos.toString());
            }
//        }while (y==0);
    }
}

    /*public void mostrarDatos(){
>>>>>>> Stashed changes
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2:9090") //Url del emulador predeterminado
                .addConverterFactory(GsonConverterFactory.create()).build();

        // Call<List<Servicio>> call = api.listServicios();
        ServiceSubasta api = retrofit.create(ServiceSubasta.class);
        Call<List<Subasta>> call = api.listSubasta(); //Se llama el método predefinido en la Api para listar
        call.enqueue(new Callback<List<Subasta>>() {
            @Override
            public void onResponse(Call<List<Subasta>> call, Response<List<Subasta>> response) {
                Log.e(" Oferta", "entra");
                Log.e(" SUbasta Contexto", getContext().toString());
                adapterSubastas = new ListIniProvAdapter(subastas, getContext()); //Aquí la consulta ya debe realizarse a la base para poder mostrar los datos
                recyclerView.setAdapter(adapterSubastas);


            }

            @Override
            public void onFailure(Call<List<Subasta>> call, Throwable t) {
                Toast.makeText(getContext(), "Error de extracción de Subastas", Toast.LENGTH_SHORT).show();

            }
        });
    }*/

