package com.example.subastainversaapp.activity.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.subastainversaapp.R;
import org.jetbrains.annotations.NotNull;

public class FragmentRealizarOferta extends Fragment {

    EditText txtprecio, txtDescripcion;
    TextView txtApellido, txtCorreo, txtTelefono
            ,txtDireccion, txtRepContra;

    //TextView
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_realizar_oferta, container, false);
        txtprecio=view.findViewById(R.id.txtprecioROofer);
        txtDescripcion=view.findViewById(R.id.txtdescROofer);
        //= new ArrayList<>();
        //mostrarDatos();
        /*btnGuardar= view.findViewById(R.id.btnConfiServicios);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,new Fragment_ServiciosConfig());
                fragmentTransaction.commit();
            }
        });*/


        return view;
    }
}