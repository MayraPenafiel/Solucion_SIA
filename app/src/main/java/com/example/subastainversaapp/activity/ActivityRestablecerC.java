package com.example.subastainversaapp.activity;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.example.subastainversaapp.R;

public class ActivityRestablecerC extends AppCompatActivity {

    Button btnValidarNueva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restablecer_c);
        btnValidarNueva= (Button) findViewById(R.id.btnValidarNueva);

        btnValidarNueva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                DialogoRecuperacionC dc = new DialogoRecuperacionC();
                dc.show(fm, "tagAlerta");
            }
        });

    }
}