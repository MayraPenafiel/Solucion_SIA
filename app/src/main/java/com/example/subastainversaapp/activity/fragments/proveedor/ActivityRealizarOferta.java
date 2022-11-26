package com.example.subastainversaapp.activity.fragments.proveedor;

import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.subastainversaapp.R;

public class ActivityRealizarOferta extends AppCompatActivity {

    EditText txtContraC, txtNombre, txtApellido, txtCorreo, txtTelefono
            ,txtDireccion, txtRepContra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizar_oferta);
    }
}