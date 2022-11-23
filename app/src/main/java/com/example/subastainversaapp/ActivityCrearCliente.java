package com.example.subastainversaapp;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import org.jetbrains.annotations.NotNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.example.subastainversaapp.activity.ActivityLogin;
import com.example.subastainversaapp.entity.Cliente;
import com.example.subastainversaapp.entity.Usuario;
import com.example.subastainversaapp.repository.ServiceCliente;
import com.example.subastainversaapp.activity.DialogoRecuperacionC;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ActivityCrearCliente extends Fragment {

    EditText txtContraC, txtNombre, txtApellido, txtCorreo, txtTelefono
            ,txtDireccion, txtRepContra;

    Button btnCrear;

    Activity activityCrearCliente = this.getActivity();

    /*@Override
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
    }*/

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.activity_crear_cliente,container,false);
        txtNombre =view.findViewById(R.id.txtNombreC);
        txtApellido= view.findViewById(R.id.txtApellidoC);
        txtCorreo= view.findViewById(R.id.txtCorreoC);
        txtTelefono= view.findViewById(R.id.txtTelefonoC);
        txtDireccion=view.findViewById(R.id.txtDireccionC);
        txtContraC= view.findViewById(R.id.txtContraC);
        txtRepContra=view.findViewById(R.id.txtRepetirC);
        btnCrear= (Button) view.findViewById(R.id.btnCrear);
        btnCrear= (Button) view.findViewById(R.id.btnCrear);
        onClickListeners();
        return view;
    }



    //AQUI AGREGAMOS EL CODIGO PARA GUARDAR
    private void onClickListeners() {
        //MOSTRAR VENTANA DE APROBACION
        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //DialogoAprovacionR dc = new DialogoAprovacionR();
                DialogoConfirmarDatos dcd = new DialogoConfirmarDatos();
                dcd.show(getChildFragmentManager(), "tagAlerta");
                //dc.show(fm, "tagAlerta");

                if (    txtNombre.getText().toString().isEmpty() ||
                        txtApellido.getText().toString().isEmpty() ||
                        txtCorreo.getText().toString().isEmpty() ||
                        txtTelefono.getText().toString().isEmpty() ||
                        txtDireccion.getText().toString().isEmpty() ||
                        txtContraC.getText().toString().isEmpty()
                ) {
                    Toast.makeText(activityCrearCliente,"Datos Erroneos",Toast.LENGTH_SHORT).show();
                    return;
                }
                Usuario us1= new Usuario();

                createPost(0L, txtNombre.getText().toString(),
                        txtApellido.getText().toString(),
                        txtCorreo.getText().toString(),
                        txtTelefono.getText().toString(),
                        txtDireccion.getText().toString(),
                        us1);

                Intent intent = new Intent (v.getContext(), ActivityLogin.class);
                startActivityForResult(intent, 0);
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
                Toast.makeText(activityCrearCliente,"MainCategoria añadido con exito",Toast.LENGTH_SHORT).show();
                txtNombre.setText("nombre");
                txtApellido.setText("apellido");
                txtCorreo.setText("email");
                txtTelefono.setText("telefono");
                txtDireccion.setText("direccion");
                usuario1.setContraseniaUsuario("contraseniaUsuario");
                usuario1.setNombreUsuario("nombreUsuario");
            }

            @Override
            public void onFailure(Call<Cliente> call, Throwable t) {
                Toast.makeText(activityCrearCliente,"ERROR de RED",Toast.LENGTH_SHORT).show();
            }

        });
    }
}

