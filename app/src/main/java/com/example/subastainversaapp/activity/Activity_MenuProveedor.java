package com.example.subastainversaapp.activity;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.subastainversaapp.ActivityConfigurarCli;
import com.example.subastainversaapp.ActivityConfigurarPro;
import com.example.subastainversaapp.R;
import com.example.subastainversaapp.activity.fragments.FragmentConfigProveedor;
import com.example.subastainversaapp.activity.fragments.proveedor.*;
import com.example.subastainversaapp.entity.Subasta;
import com.google.android.material.navigation.NavigationView;
import org.jetbrains.annotations.NotNull;

public class Activity_MenuProveedor extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,IComunicaProvOfert{

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

    //Variables fragment main
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    //Variable para pasar el detalle de la subasta
    FragmentRealizarOferta fragmentRealizarOferta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_proveedor);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=findViewById(R.id.drawer_proveedor);
        navigationView = findViewById(R.id.navigationView);
        //Aquí se establece evento onclick al navigationView
        navigationView.setNavigationItemSelectedListener(this);

        //Se implementan los layout creados para el menú
        actionBarDrawerToggle= new ActionBarDrawerToggle(this, drawerLayout,toolbar, R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

        //Cargar fragment main (que se cargará después de iniciar sesión)
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container,new FragmentInicioProveedor());
        fragmentTransaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        if(item.getItemId() ==R.id.home){
            fragmentManager=getSupportFragmentManager();
            fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container,new FragmentInicioProveedor());
            fragmentTransaction.commit();
        }
        if(item.getItemId() ==R.id.ofertas_activas){
            fragmentManager=getSupportFragmentManager();
            fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container,new FragmentOfertasActivas());
            fragmentTransaction.commit();
        }
        if(item.getItemId() ==R.id.ofertas_aceptadas){
            fragmentManager=getSupportFragmentManager();
            fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container,new FragmentOfertasAceptadas());
            fragmentTransaction.commit();
        }
        if(item.getItemId() ==R.id.ofertas_r){
            fragmentManager=getSupportFragmentManager();
            fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container,new FragmentOfertasRechazadas());
            fragmentTransaction.commit();
        }
        /*if(item.getItemId() ==R.id.notificaciones){
            fragmentManager=getSupportFragmentManager();
            fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container,new Menu_principal());
            fragmentTransaction.commit();
        }*/
        if(item.getItemId() ==R.id.configuracion){
            fragmentManager=getSupportFragmentManager();
            fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container,new FragmentConfigProveedor());
            fragmentTransaction.commit();
        }
        /*if(item.getItemId() ==R.id.log_out){
            fragmentManager=getSupportFragmentManager();
            fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container,new ActivityLogin());
            fragmentTransaction.commit();
        }*/
        return false;
    }

    @Override
    public void enviarDetSubasta(Subasta subasta) {

        fragmentRealizarOferta = new FragmentRealizarOferta();
        //Objeto bundle para pasar la información
        Bundle bundleEnvio = new Bundle();
        //Enviar objeto
        bundleEnvio.putSerializable("objeto",subasta);
        fragmentRealizarOferta.setArguments(bundleEnvio);
        //Se abre fragment
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,new FragmentRealizarOferta());
        fragmentTransaction.commit();

    }
}