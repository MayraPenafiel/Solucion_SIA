package com.example.subastainversaapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.entity.Subasta;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ListAdapterSubasta extends RecyclerView.Adapter<ListAdapterSubasta.ViewHolder>{

    private List<Subasta> SDatos;
    private LayoutInflater nInflater;
    private Context context;

    public ListAdapterSubasta(List<Subasta> SDatos, Context context) {
        this.SDatos = SDatos;
        this.nInflater = nInflater;
        this.context = context;
    }

    @Override
    public ListAdapterSubasta.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = nInflater.inflate(R.layout.activity_items_subasta,null);
        return new ListAdapterSubasta.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ListAdapterSubasta.ViewHolder holder, int position) {
        //holder.bindData(SDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return SDatos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView ProveedorSu,servicioitemSu,fechainicioSu,PrecioSu,valoracionSu;
        ViewHolder(View itemView){
            super(itemView);
            ProveedorSu=itemView.findViewById(R.id.ProveedorSu);
            servicioitemSu=itemView.findViewById(R.id.servicioitemSu);
            fechainicioSu=itemView.findViewById(R.id.fechainicioSu);
            PrecioSu=itemView.findViewById(R.id.PrecioSu);
            valoracionSu=itemView.findViewById(R.id.valoracionSu);
        }

        /*void bindData(final Subasta item){
            ProveedorSu.setText(item.ge);
            servicioitemSu.setText(item.get);
        }*/


    }
}
