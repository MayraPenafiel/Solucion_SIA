package com.example.subastainversaapp.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.subastainversaapp.*;
import com.example.subastainversaapp.entity.ResponsesClassUsuario;
import com.example.subastainversaapp.entity.Usuario;
import com.example.subastainversaapp.repository.ServiceUsuario;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.ArrayList;

public class ActivityLogin extends AppCompatActivity {

    TextView txtOlvidar_contrasena,txtCrear_cuenta,txtCear_provedor;
    Button btnIngresar;
    EditText txtUsuario,txtContra;
    private static final String URL1="";
    ArrayList<String> datos = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtOlvidar_contrasena=findViewById(R.id.txtOlvidar_contrasena);
        txtCrear_cuenta=findViewById(R.id.txtCrear_cuenta);
        txtCear_provedor=findViewById(R.id.txtCear_provedor);
        btnIngresar=findViewById(R.id.btn_ingresar);
        txtUsuario=findViewById(R.id.edtTextUsuario);
        txtContra=findViewById(R.id.editTextTextPassword);
        txtOlvidar_contrasena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //METODO PARA CAMBIAR VENTANA
                Intent recuperarC = new Intent(ActivityLogin.this, ActivityRecuperaC.class);
                startActivity(recuperarC);
                //finish();
                //startActivity(new Intent(ActivityLogin.this, ActivityRecuperaC.class));
           }
        });

        txtCrear_cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityLogin.this, ActivityCrearCliente.class));
            }
        });

        txtCear_provedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityLogin.this, ActivityCrearProveedor.class));
            }
        });

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Proveedores
            //    startActivity(new Intent(ActivityLogin.this, Activity_MenuProveedor.class));
//Clientes
                startActivity(new Intent(ActivityLogin.this, ActivityMenuCliente.class));

                /*
                Validar USUARIO

                Usuario responseRegisterClass = new Usuario(txtUsuario.getText().toString(), txtContra.getText().toString());

                ServiceUsuario apiService = Apis.getInstance().create(ServiceUsuario.class);
                apiService.createUsuario(responseRegisterClass).enqueue(new Callback<ResponsesClassUsuario>() {

                    @Override
                    public void onResponse(Call<ResponsesClassUsuario> call, Response<ResponsesClassUsuario> response) {
                        if (response.body() != null) {
                            Toast.makeText(ActivityLogin.this, "Login successful", Toast.LENGTH_SHORT).show();
                      //      Intent intent = new Intent(ActivityLogin.this, MainCategoria.class);
                      //      intent.putExtra("usuario", response.body().getNombreUsuario());
                      //     startActivity(intent);
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponsesClassUsuario> call, Throwable t) {
                        Toast.makeText(ActivityLogin.this, "Credenciales Invalidos", Toast.LENGTH_SHORT).show();
                    }


                });
                 */
            }

        });
    }

}