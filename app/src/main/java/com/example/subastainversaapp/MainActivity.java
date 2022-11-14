package com.example.subastainversaapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Animation animacion1= AnimationUtils.loadAnimation( this,R.anim.desplazamiento_arriba);
        //ImageView logo_galeria= findViewById(R.id.logo_galeria);
        //logo_galeria.setAnimation(animacion1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, ActivityLogin.class);
                startActivity(intent);
                //finish();

            }
        }, 3000);
    }

    /*public void inicar(View view) {
        Intent i = new Intent(this, ActivityLogin.class );
        startActivity(i);
        finish();
    }*/


}