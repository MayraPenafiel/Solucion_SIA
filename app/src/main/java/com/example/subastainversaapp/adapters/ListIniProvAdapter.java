package com.example.subastainversaapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.subastainversaapp.R;
import com.example.subastainversaapp.entity.Subasta;

import java.util.List;

public class ListIniProvAdapter extends RecyclerView.Adapter<ListIniProvAdapter.ViewHolder> {

    private List<Subasta> auctionList;
    private LayoutInflater layoutInflater;
    private Context context;

    public ListIniProvAdapter(List<Subasta> auctionList, Context context){
        this.layoutInflater = LayoutInflater.from(context);
        this.auctionList = auctionList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.inicio_prov_item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(auctionList.get(position));
        holder.des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //implement onClick
                Toast.makeText(context, holder.des.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return auctionList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView des;

        ViewHolder (View view){
            super(view);
            des= view.findViewById(R.id.txtserviniprov);
        }

        void bindData (final Subasta item){
            des.setText("Hola");
        }
    }
}
