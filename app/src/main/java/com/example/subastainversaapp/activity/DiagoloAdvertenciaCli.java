package com.example.subastainversaapp.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import com.example.subastainversaapp.R;

public class DiagoloAdvertenciaCli extends DialogFragment {

    Button btnContinuar,btnACancelar;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return  dialogoConfirmarDatos();
    }

    private AlertDialog dialogoConfirmarDatos() {
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_diagolo_advertencia_cli, null);
        builder.setView(v);
        btnContinuar = v.findViewById(R.id.btnContinuar);
        btnACancelar = v.findViewById(R.id.btnACancelar);
        //SE MOSTRARA LA VENTANA DE APROVACION EN PROVEEDORES/AGREGAR SERVICIO
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { dismiss();
            }
        });
        btnACancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return builder.create();
    }
}