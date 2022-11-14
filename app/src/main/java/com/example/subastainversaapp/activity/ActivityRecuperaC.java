package com.example.subastainversaapp.activity;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.example.subastainversaapp.R;

public class ActivityRecuperaC extends AppCompatActivity {

    Button btn_enviar_codigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recupera_c);
        btn_enviar_codigo = (Button) findViewById(R.id.btn_enviar_codigo);

        btn_enviar_codigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                DialogoCorreoV dc = new DialogoCorreoV();
                dc.show(fm, "tagAlerta");
            }
        });

    }


}