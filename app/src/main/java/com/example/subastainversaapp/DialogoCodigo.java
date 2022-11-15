package com.example.subastainversaapp;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class DialogoCodigo extends DialogFragment {

    Button btnAceptarCodigo;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return dialogoCodigo();
    }

    private AlertDialog dialogoCodigo() {
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_dialogo_codigo, null);
        builder.setView(v);
        btnAceptarCodigo = v.findViewById(R.id.btnAceptarCodigo);

        btnAceptarCodigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return builder.create();
    }
}