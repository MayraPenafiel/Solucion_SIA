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
    ListAdapterCategorias adapatador = null;

    private String nombres [] ={"Mateo","Mayra"};
    private String edades []={"21","22"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider_home);
        saleList= (ListView) findViewById(R.id.listSale);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.sale_list_item, nombres);
        saleList.setAdapter(adapter);
   //     saleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        //          @Override
        //           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//             }
        //        });

    }
    //    public void loadSale(){
    //     ServiceCategoria api = ConnectionRest.getConnetion().create(ServiceCategoria.class);

    //    Call<List<Categoria>> call = api.getCategorias();
    //    call.enqueue(new Callback<List<Categoria>>() {
    //         @Override
    //        public void onResponse(Call<List<Categoria>> call, Response<List<Categoria>> response) {
    //            List<Categoria> lista = response.body();
    //            for(Categoria x:lista){
    //                categoriaArrayList.add(x);
    //            }
    //            adapatador.notifyDataSetChanged();
//
    //       }

    //        @Override
    //       public void onFailure(Call<List<Categoria>> call, Throwable t) {}
    //   });

    }
}