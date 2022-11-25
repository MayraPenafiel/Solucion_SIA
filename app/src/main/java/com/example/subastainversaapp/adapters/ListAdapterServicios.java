package com.example.subastainversaapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.entity.Servicio;

import java.util.List;

public class ListAdapterServicios extends RecyclerView.Adapter<ListAdapterServicios.ViewHolder>  {
    private List<Servicio> lDatos;
    private LayoutInflater nInflater;
    private Context context;

    public ListAdapterServicios(List<Servicio> itemList, Context context) {
        this.nInflater = LayoutInflater.from(context);
        this.lDatos = itemList;
        this.context = context;
    }

    @Override
    public int getItemCount(){
        return lDatos.size();
    }

    @Override
    public ListAdapterServicios.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = nInflater.inflate(R.layout.list_service_item,null);
        return new ListAdapterServicios.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapterServicios.ViewHolder holder,final int position){
        holder.bindData(lDatos.get(position));
    }
    public void setItems(List<Servicio> items){
        lDatos=items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView servicio,categoria;
        ViewHolder(View itemView){
            super(itemView);
            servicio=itemView.findViewById(R.id.servicio_nombre);
            categoria=itemView.findViewById(R.id.categoria_servicio);

        }

        void bindData(final Servicio item){
            servicio.setText(item.getNombreServicio());
            categoria.setText(item.getDescripcion_servicio());
        }


    }
}
