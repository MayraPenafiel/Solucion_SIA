package com.example.subastainversaapp;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class DialogoAprovacionR extends DialogFragment {

    Button btnAceptarExitoso;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return dialogoAprovacion();
    }

    private AlertDialog dialogoAprovacion() {
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_dialogo_aprovacion_r, null);
        builder.setView(v);
        btnAceptarExitoso = v.findViewById(R.id.btnAceptarExitoso);

        btnAceptarExitoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return builder.create();
    }
}