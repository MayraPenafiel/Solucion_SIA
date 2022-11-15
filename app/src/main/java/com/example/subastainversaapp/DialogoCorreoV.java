package com.example.subastainversaapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.example.subastainversaapp.R;
import org.jetbrains.annotations.NotNull;

public class DialogoCorreoV extends DialogFragment {

    Button btnAceptarCorreo;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return dialogoCorreo();
    }

    private AlertDialog dialogoCorreo() {
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_dialogo_correo_v, null);
        builder.setView(v);
        btnAceptarCorreo = v.findViewById(R.id.btnAceptarCorreo);
        btnAceptarCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return builder.create();
    }
}