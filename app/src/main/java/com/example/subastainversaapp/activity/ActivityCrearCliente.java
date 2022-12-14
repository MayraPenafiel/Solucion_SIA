package com.example.subastainversaapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.entity.Cliente;
import com.example.subastainversaapp.entity.Usuario;
import com.example.subastainversaapp.repository.ServiceCliente;
import com.example.subastainversaapp.sqlite.InsertsDBHelper;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ActivityCrearCliente extends AppCompatActivity {

    EditText txtContraC, txtNombre, txtApellido, txtCorreo, txtTelefono
            ,txtDireccion, txtRepContra;

    Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cliente);
        txtNombre =findViewById(R.id.txtNombreC);
        txtApellido= findViewById(R.id.txtApellidoC);
        txtCorreo= findViewById(R.id.txtCorreoC);
        txtTelefono= findViewById(R.id.txtTelefonoC);
        txtDireccion=findViewById(R.id.txtDireccionC);
        txtContraC= findViewById(R.id.txtContraC);
        txtRepContra=findViewById(R.id.txtRepetirC);
        btnCrear= (Button) findViewById(R.id.btnCrear);
        onClickListeners();
    }

    //AQUI AGREGAMOS EL CODIGO PARA GUARDAR
    private void onClickListeners() {
        //MOSTRAR VENTANA DE APROBACION
        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //FragmentManager fm = getSupportFragmentManager();
                //DialogoAprovacionR dc = new DialogoAprovacionR();

                //dc.show(fm, "tagAlerta");

                if (txtNombre.getText().toString().isEmpty() ||
                        txtApellido.getText().toString().isEmpty() ||
                        txtCorreo.getText().toString().isEmpty() ||
                        txtTelefono.getText().toString().isEmpty() ||
                        txtDireccion.getText().toString().isEmpty() ||
                        txtContraC.getText().toString().isEmpty() ||
                        txtNombre.getText().toString() == "" ||
                        txtApellido.getText().toString() == "" ||
                        txtCorreo.getText().toString() == "" ||
                        txtTelefono.getText().toString() == "" ||
                        txtDireccion.getText().toString() == "" ||
                        txtContraC.getText().toString() == ""
                ) {
                    Toast.makeText(ActivityCrearCliente.this, "Datos Erroneos", Toast.LENGTH_LONG).show();
                    System.out.println("Los campos estan vacios");
                    return;
                } else {
                    if (txtContraC.getText().toString() == "" || txtContraC.getText().toString().isEmpty() ||
                            txtRepContra.getText().toString() == "" || txtRepContra.getText().toString().isEmpty()) {
                        Toast.makeText(ActivityCrearCliente.this, "Las Contrase??as no coinciden", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        if (txtContraC.getText().toString() == txtRepContra.getText().toString()) {
                            //DialogoConfirmarDatos dcd = new DialogoConfirmarDatos();
                            //dcd.show(fm, "tagAlerta");
                            System.out.println("COntrase??as no vacias");
                        }
                    }
                    Usuario us1 = new Usuario();

                    createPost(0L, txtNombre.getText().toString(),
                            txtApellido.getText().toString(),
                            txtCorreo.getText().toString(),
                            txtTelefono.getText().toString(),
                            txtDireccion.getText().toString(),
                            us1);

                    Intent intent = new Intent(v.getContext(), ActivityLogin.class);
                    startActivityForResult(intent, 0);
                    InsertsDBHelper save = new InsertsDBHelper(ActivityCrearCliente.this);
                    save.insertRC(txtNombre.getText().toString(), txtApellido.getText().toString(), txtCorreo.getText().toString(), txtTelefono.getText().toString(), txtDireccion.getText().toString(), txtContraC.getText().toString(),txtCorreo.getText().toString(),txtContraC.getText().toString());
                    save.insertUsuario(us1.getNombreUsuario(),us1.getContraseniaUsuario());
                }
            }
        });
    }
    //VALIDACIONES
    private boolean validarContrase() {
        if (txtContraC.getText().toString().length() < 4) {
            txtContraC.setError("la contrase??a debe tener mas de 4 caracteres");
            txtContraC.requestFocus();
            return false;
        } else if (TextUtils.isEmpty(txtContraC.getText().toString())) {
            txtContraC.setError("contrase??a no permititda");
            txtContraC.requestFocus();
            return false;
        }
        return true;
    }

    private void createPost(Long id_persona, String nombre, String apellido, String email, String telefono, String direccion, Usuario usuario) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2:9090")
                .addConverterFactory(GsonConverterFactory.create()).build();

        ServiceCliente clienteservice = retrofit.create(ServiceCliente.class);
        Usuario usuario1= new Usuario(txtCorreo.getText().toString(),txtContraC.getText().toString());
        Cliente c = new Cliente(id_persona,nombre,apellido, email,telefono,direccion,usuario1);
        Call<Cliente> call=clienteservice.createCliente(c);

        call.enqueue(new Callback<Cliente>() {
            @Override
            public void onResponse(Call<Cliente> call, Response<Cliente> response) {
                Toast.makeText(ActivityCrearCliente.this, "Cliente a??adido con exito", Toast.LENGTH_SHORT).show();
                txtNombre.setText("nombre");
                txtApellido.setText("apellido");
                txtCorreo.setText("email");
                txtTelefono.setText("telefono");
                txtDireccion.setText("direccion");
                usuario1.setContraseniaUsuario("contrasenia_usuario");
                usuario1.setNombreUsuario("nombre_usuario");
            }

            @Override
            public void onFailure(Call<Cliente> call, Throwable t) {
                Toast.makeText(ActivityCrearCliente.this, "ERROR de RED", Toast.LENGTH_SHORT).show();
            }

        });
    }
}

