package com.example.subastainversaapp.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.example.subastainversaapp.R;
import org.jetbrains.annotations.NotNull;

public class ActivityConfigurarCli extends Fragment{

    Button btnGuardarConCli;

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurar_cli);
        onClickListeners();
    }*/

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.activity_configurar_cli,container,false);
        btnGuardarConCli= view.findViewById(R.id.btnGuardarConCli);
        onClickListeners();
        return view;
    }

    //AQUI AGREGAMOS EL CODIGO PARA GUARDAR
    private void onClickListeners() {
        //MOSTRAR VENTANA DE APROBACION
        btnGuardarConCli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiagoloAdvertenciaCli dcd = new DiagoloAdvertenciaCli();
                dcd.show(getFragmentManager(), "tagAlerta");
            }
        });

    }
}