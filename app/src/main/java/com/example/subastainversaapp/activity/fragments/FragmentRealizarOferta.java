package com.example.subastainversaapp.activity.fragments.proveedor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.entity.Subasta;
import org.jetbrains.annotations.NotNull;

public class FragmentRealizarOferta extends Fragment {

    EditText txtContraC, txtNombre, txtApellido, txtCorreo, txtTelefono
            ,txtDireccion, txtRepContra;
    TextView numSubasta, nombreServicio,fechaInicio, fechaFinal;
    ImageView imagenSubasta;
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.activity_realizar_oferta,container,false);
        numSubasta = view.findViewById(R.id.numeroDetSubasta);
        nombreServicio=view.findViewById(R.id.servicioROsub);
        fechaInicio = view.findViewById(R.id.fechainicioROsub);
        fechaFinal= view.findViewById(R.id.fechafinROsub);

        Bundle objetoSubasta = getArguments();
        Subasta subasta = null;

        if(objetoSubasta!=null){
            subasta= (Subasta) objetoSubasta.getSerializable("objeto");
            numSubasta.setText(subasta.getIdSubasta().toString());
            nombreServicio.setText(subasta.getNombreServicio());
            fechaInicio.setText(subasta.getFechaInicio().toString());
            fechaFinal.setText(subasta.getFechaFin().toString());

        }

        return view;
    }
}