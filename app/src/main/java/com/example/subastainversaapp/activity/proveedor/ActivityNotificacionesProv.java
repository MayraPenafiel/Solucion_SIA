package com.example.subastainversaapp.activity.proveedor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.entity.Subasta;

import java.util.List;

public class ActivityNotificacionesProv extends AppCompatActivity {

    List<String> messages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones);
    }
}