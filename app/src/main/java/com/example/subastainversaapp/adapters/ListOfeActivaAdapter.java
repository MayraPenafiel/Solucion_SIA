package com.example.subastainversaapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.entity.Oferta;

import java.util.List;

public class ListOfeActivaAdapter extends RecyclerView.Adapter<ListOfeActivaAdapter.ViewHolder> {

    private List<Oferta> auctionList;
    private LayoutInflater layoutInflater;
    private Context context;



    public ListOfeActivaAdapter(List<Oferta> auctionList, Context context){
        this.layoutInflater = LayoutInflater.from(context);
        this.auctionList = auctionList;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return auctionList.size();
    }

    @Override
    public ListOfeActivaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = layoutInflater.inflate(R.layout.item_ofertaprov,null);
        return new ListOfeActivaAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListOfeActivaAdapter.ViewHolder holder , final int position) {
        holder.bindData(auctionList.get(position));
        /*holder.lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //implement onClick

                Toast.makeText(context, holder.servicio.getText(), Toast.LENGTH_LONG).show();
            }
        });*/
    }

    public void setItems(List<Oferta> items){
        auctionList=items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView numero, servicio, fcini, prec;
        ListView lista;
        Button ofert;

        ViewHolder(View itemView) {
            super(itemView);
            numero = itemView.findViewById(R.id.txtnroOR);
            servicio = itemView.findViewById(R.id.txtservOR);
            fcini = itemView.findViewById(R.id.txtfecOR);
            prec = itemView.findViewById(R.id.txtprecioOR);
            lista=itemView.findViewById(R.id.listaOfertaActiva);
        }

        void bindData(final Oferta item) {
            System.out.println(item);
            //if(item.getServicio().getIdServicio()==)
            //Long nro=item.getIdOferta();
            //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            //String f_ini=formato.format(item.getFecha());
            //numero.setText(nro+"");
            //servicio.setText(item.getSubasta().getServicio().getNombreServicio());
            //fcini.setText(item.getFecha());
            //prec.setText(item.getPercioOferta().toString());
        }

    }
}
