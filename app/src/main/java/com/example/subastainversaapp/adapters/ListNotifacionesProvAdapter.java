package com.example.subastainversaapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.subastainversaapp.MainActivity;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.entity.Oferta;
import com.example.subastainversaapp.entity.Subasta;

import java.util.List;

public class ListNotifacionesProvAdapter extends RecyclerView.Adapter<ListNotifacionesProvAdapter.ViewHolder> {

    private List<String> messageList;
    private List<Oferta> ofertaList;

    private List<Subasta> subastas;
    private LayoutInflater layoutInflater;
    private Context context;

    public ListNotifacionesProvAdapter(List<String> messageList, Context context) {
        this.layoutInflater = LayoutInflater.from(context);
        this.messageList = MainActivity.messageList;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    @Override
    public ListNotifacionesProvAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_notificacion, null);
        return new ListNotifacionesProvAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListNotifacionesProvAdapter.ViewHolder holder, final int position) {
        holder.bindData(messageList.get(position));
    }

    public void setItems(List<Oferta> items) {
        ofertaList = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mens;

        ViewHolder(View itemView) {
            super(itemView);
            mens = itemView.findViewById(R.id.txtnotificacion);
        }

        void bindData(final String item) {

            /*if(item.get.getIdServicio()==)
            Long nro=item.getIdOferta();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String f_ini=formato.format(item.getFecha());
            numero.setText(nro+"");
            servicio.setText(item.getSubasta().getServicio().getNombreServicio());
            fc.setText(f_ini);
            double pre =item.getPercioOferta();
            precio.setText(pre+"");*/
        }

    }
}
