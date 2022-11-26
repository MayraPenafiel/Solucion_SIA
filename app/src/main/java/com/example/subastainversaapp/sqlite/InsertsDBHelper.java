package com.example.subastainversaapp.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

public class InsertsDBHelper extends DBHelper{
    Context context;
    public InsertsDBHelper(@Nullable Context context) {
        super(context);
        this.context=context;
    }

    public long insertRProveedor(String nombre,String apellido,String email,String telefono,String direccion,String contrasenia) {

        long id=0;
        try {
            DBHelper dbHelper = new DBHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("nombre",nombre);
            values.put("apellido",apellido);
            values.put("email",email);
            values.put("telefono",telefono);
            values.put("direccion",direccion);
            values.put("contrasenia",contrasenia);
            id = db.insert("t_registro_proveedor",null,values);

        }catch (Exception e ){
            e.toString();
        }
        return id;
    }
    public long insertUsuario(String id_persona,String nombre,String apellido,String email,String telefono,String direccion,String imagen,String contrasenia) {

        long id=0;
        try {
            DBHelper dbHelper = new DBHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("id_persona",id_persona);
            values.put("nombre",nombre);
            values.put("apellido",apellido);
            values.put("email",email);
            values.put("telefono",telefono);
            values.put("direccion",direccion);
            values.put("imagen",imagen);
            values.put("contrasenia",contrasenia);
            id = db.insert("t_usuario",null,values);

        }catch (Exception e ){
            e.toString();
        }
        return id;
    }
    public long insertNotificaciones(String id_usuario,String nombre,String apellido) {

        long id=0;
        try {
            DBHelper dbHelper = new DBHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("id_usuario",id_usuario);
            values.put("mensaje_principal",nombre);
            values.put("mesnaje_Secundario",apellido);
            id = db.insert("t_notificaciones",null,values);
        }catch (Exception e ){
            e.toString();
        }
        return id;
    }
    public long insertSubasta(String id_subasta,String fechaInicio,String fechaFin,String estadoSubasta,String descripcionSubasta,String imgSubasta) {

        long id=0;
        try {
            DBHelper dbHelper = new DBHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("id_subasta",id_subasta);
            values.put("fechaInicio",fechaInicio);
            values.put("fechaFin",fechaFin);
            values.put("estadoSubasta",estadoSubasta);
            values.put("descripcionSubasta",descripcionSubasta);
            values.put("imgSubasta",imgSubasta);
            id = db.insert("t_subasta",null,values);

        }catch (Exception e ){
            e.toString();
        }
        return id;
    }
    public long insertOferta(String idOferta,String percioOferta,String calificacion,String fecha,String descripcion_oferta,String contrasenia) {

        long id=0;
        try {
            DBHelper dbHelper = new DBHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("idOferta",idOferta);
            values.put("percioOferta",percioOferta);
            values.put("calificacion",calificacion);
            values.put("fecha",fecha);
            values.put("descripcion_oferta",descripcion_oferta);

            id = db.insert("t_oferta",null,values);

        }catch (Exception e ){
            e.toString();
        }
        return id;
    }
}
