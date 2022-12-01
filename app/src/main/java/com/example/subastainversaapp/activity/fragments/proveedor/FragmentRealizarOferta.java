package com.example.subastainversaapp.activity.fragments.proveedor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.subastainversaapp.R;
import org.jetbrains.annotations.NotNull;

public class FragmentRealizarOferta extends Fragment {

    EditText txtContraC, txtNombre, txtApellido, txtCorreo, txtTelefono
            ,txtDireccion, txtRepContra;
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.activity_realizar_oferta,container,false);

        return view;
    }
}