package com.example.subastainversaapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.entity.Oferta;

import java.text.SimpleDateFormat;
import java.util.List;

public class ListOfeActivaAdapter extends RecyclerView.Adapter<ListOfeActivaAdapter.ViewHolder> {

    private List<Oferta> ofertaList;
    private LayoutInflater layoutInflater;
    private Context context;

    public ListOfeActivaAdapter(List<Oferta> ofertaList, Context context){
        this.layoutInflater = LayoutInflater.from(context);
        this.ofertaList = ofertaList;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return ofertaList.size();
    }

    @Override
    public ListOfeActivaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = layoutInflater.inflate(R.layout.item_ofertaprov,null);
        return new ListOfeActivaAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListOfeActivaAdapter.ViewHolder holder , final int position) {
        holder.bindData(ofertaList.get(position));
        /*holder.lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //implement onClick

                Toast.makeText(context, holder.servicio.getText(), Toast.LENGTH_LONG).show();
            }
        });*/
    }

    public void setItems(List<Oferta> items){
        ofertaList=items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView numero, servicio, fc, precio;
        ListView lista;

        ViewHolder(View itemView) {
            super(itemView);
            numero = itemView.findViewById(R.id.txtnrooferta);
            servicio = itemView.findViewById(R.id.txtservoferta);
            fc = itemView.findViewById(R.id.txtfecoferta);
            precio = itemView.findViewById(R.id.txtpreciooferta);
            lista=itemView.findViewById(R.id.listaOfertaActiva);
        }

        void bindData(final Oferta item) {

            //if(item.getServicio().getIdServicio()==)
            Long nro=item.getIdOferta();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String f_ini=formato.format(item.getFecha());
            numero.setText(nro+"");
            servicio.setText(item.getSubasta().getServicio().getNombreServicio());
            fc.setText(f_ini);
            double pre =item.getPercioOferta();
            precio.setText(pre+"");
        }

    }
}
