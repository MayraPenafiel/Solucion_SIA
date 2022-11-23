package com.example.subastainversaapp.entity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.subastainversaapp.R;

import java.util.ArrayList;

public class ListAdapterSale extends ArrayAdapter<Sale> {
    public ListAdapterSale(Context context, ArrayList<Sale> SaleArrayList){

        super(context, R.layout.list_item_sale,SaleArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String URL_INTERNET;
        Sale sale = getItem(position);

        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_sale,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.imagenProducto);
        TextView nombreprod = convertView.findViewById(R.id.txtNombreSub);
        TextView stock = convertView.findViewById(R.id.txtStock);
        Button favoritos = convertView.findViewById(R.id.btn_Fav);


        //URL_INTERNET=favorito.getFoto().toString();
        //Picasso.get().load(URL_INTERNET).into(imageView);
        nombreprod.setText(sale.getId_oferta().toString());
        //stock.setText(favorito.getStock().toString());
        return convertView;

    }
}
