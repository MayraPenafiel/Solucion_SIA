package com.example.subastainversaapp.activity.fragments.proveedor;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.subastainversaapp.R;

import java.util.List;

public class ActivityNotificacionesProv extends AppCompatActivity {

    List<String> messages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_notificaciones_prov);
    }
}