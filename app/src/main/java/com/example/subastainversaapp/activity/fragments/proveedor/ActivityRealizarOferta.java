package com.example.subastainversaapp.activity.fragments.proveedor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.example.subastainversaapp.R;
import org.jetbrains.annotations.NotNull;

public class ActivityRealizarOferta extends Fragment {

    EditText txtContraC, txtNombre, txtApellido, txtCorreo, txtTelefono
            ,txtDireccion, txtRepContra;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_realizar_oferta, container, false);

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