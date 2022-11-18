package com.example.subastainversaapp;

import android.app.Dialog;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

public class DialogoConfirmarDatos extends DialogFragment {

    Button btnAceptarDialogConfirma,btnAceptarDialogCancelar;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return  dialogoConfirmarDatos();
    }

    private AlertDialog dialogoConfirmarDatos() {
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_dialogo_confirmar_datos, null);
        builder.setView(v);
        btnAceptarDialogConfirma = v.findViewById(R.id.btnAceptarDialogConfirma);
        btnAceptarDialogCancelar = v.findViewById(R.id.btnAceptarDialogCancelar);
        //SE MOSTRARA LA VENTANA DE APROVACION EN PROVEEDORES/AGREGAR SERVICIO
        btnAceptarDialogConfirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { dismiss();
            }
        });
        btnAceptarDialogCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return builder.create();
    }
}