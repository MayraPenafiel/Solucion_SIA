package com.example.subastainversaapp.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.activity.Activity_Provider_Home;

import java.util.List;

public class Activity_Provider_Home extends AppCompatActivity {

    Activity_Provider_Home binding;
    private ListView saleList;
    //ListAdapterCategorias adapatador = null; CUANDO SE LE ACTIVA SALE UN ERROR QUE HAY QUE CREAR LA CLASE lIDT ADAPTEC :/

    private String nombres [] ={"Mateo","Mayra"};
    private String edades []={"21","22"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_home);
        saleList= (ListView) findViewById(R.id.listSale);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.sale_list_item, nombres);
        saleList.setAdapter(adapter);


    }

}