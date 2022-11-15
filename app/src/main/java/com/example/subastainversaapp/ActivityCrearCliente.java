package com.example.subastainversaapp;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.example.subastainversaapp.activity.DialogoRecuperacionC;

public class ActivityCrearCliente extends AppCompatActivity {

    EditText txtContraC;

    Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cliente);
        btnCrear= (Button) findViewById(R.id.btnCrear);
        onClickListeners();
    }

    private void onClickListeners() {
        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                DialogoAprovacionR dc = new DialogoAprovacionR();
                dc.show(fm, "tagAlerta");
            }
        });
    }


    //VALIDACIONES
    private boolean validarContrase() {
        if (txtContraC.getText().toString().length() < 4) {
            txtContraC.setError("la contraseña debe tener mas de 4 caracteres");
            txtContraC.requestFocus();
            return false;
        } else if (TextUtils.isEmpty(txtContraC.getText().toString())) {
            txtContraC.setError("contraseña no permititda");
            txtContraC.requestFocus();
            return false;
        }
        return true;
    }
}

