package com.example.subastainversaapp.activity;

import android.widget.RatingBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.subastainversaapp.R;

public class ActivitySubastaporCalificar extends AppCompatActivity {

    RatingBar calificacionEstr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subastapor_calificar);
        calificacionEstr= (RatingBar) findViewById(R.id.calificacionEstr);
        calificacionEstr.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                int valor = (int) Math.round(rating);
                Toast.makeText(ActivitySubastaporCalificar.this,"melloco XD: " + valor,Toast.LENGTH_LONG).show();
            }
        });

    }
}