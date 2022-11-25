package com.example.subastainversaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.subastainversaapp.activity.ActivityLogin;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<String>messageList;
    Button info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info = findViewById(R.id.carga);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), ActivityLogin.class);
                startActivity(intent);
            }

        });
    }

}