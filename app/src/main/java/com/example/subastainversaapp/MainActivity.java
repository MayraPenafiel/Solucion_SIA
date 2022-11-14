package com.example.subastainversaapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import com.example.subastainversaapp.activity.ActivityLogin;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

        public void run() {
            Intent intent= new Intent(MainActivity.this, ActivityLogin.class);
            startActivity(intent);
            finish();
        }



}