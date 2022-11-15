package com.example.subastainversaapp.activity;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.example.subastainversaapp.R;

public class DialogoRecuperacionC extends DialogFragment {

    Button btnAceptarCambio;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return dialogoRecuperacion();
    }

    private AlertDialog dialogoRecuperacion() {
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_dialogo_recuperacion_c, null);
        builder.setView(v);
        btnAceptarCambio = v.findViewById(R.id.btnAceptarCambio);

        btnAceptarCambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return builder.create();
    }
}