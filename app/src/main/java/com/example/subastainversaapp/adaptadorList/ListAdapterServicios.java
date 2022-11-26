package com.example.subastainversaapp.adaptadorList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.subastainversaapp.ActivityRegistrarServicio;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.entity.Servicio;

import java.util.ArrayList;

public class ListAdapterServicios   {
    /*

    extends ArrayAdapter<Servicio>


    private static Context Activity = ActivityRegistrarServicio;

    public ListAdapterServicios(Context context, ArrayList<Servicio> CategoriaArrayList){
        super(context, R.layout.list_item_cat,CategoriaArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Categoria categoria = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_cat,parent,false);

        }

        TextView nombrecat = convertView.findViewById(R.id.txtNombreCat);
        TextView descripcioncat = convertView.findViewById(R.id.txtDescripcion);

        nombrecat.setText(categoria.getNombre());
        descripcioncat.setText(categoria.getDescripcion());
        return convertView;
    }
*/
}
