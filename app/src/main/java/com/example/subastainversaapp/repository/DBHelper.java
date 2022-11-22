package com.example.subastainversaapp.repository;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION =1;
    private static final String DATABASE_NOMBRE= "SUBASTA_APP";
    private static final String TABLA_PROVEEDOR ="t_proveedor";
    private static final String TABLA_CLIENTE ="t_cliente";
    private static final String TABLA_REGISTRO_PROVEEDOR ="t_registro_proveedor";
    private static final String TABLA_USUARIO  ="t_usuario";
    private static final String TABLA_OFERTA  ="t_oferta";
    private static final String TABLA_SUBASTA  ="t_subasta";

    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NOMBRE, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE "+ TABLA_REGISTRO_PROVEEDOR+" ("+
                "id_persona INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "nombre TEXT NOT NULL, "+
                "apellido TEXT NOT NULL, "+
                "email TEXT NOT NULL, "+
                "telefono TEXT NOT NULL, "+
                "direccion TEXT NOT NULL, "+
                "contrasenia TEXT NOT NULL)");

        db.execSQL("CREATE TABLE "+ TABLA_USUARIO+" ("+
                "id_usuario INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "nombre TEXT NOT NULL, "+
                "apellido TEXT NOT NULL, "+
                "email TEXT NOT NULL, "+
                "telefono TEXT NOT NULL, "+
                "direccion TEXT NOT NULL, "+
                "contrasenia TEXT NOT NULL)");

        db.execSQL("CREATE TABLE "+ TABLA_PROVEEDOR+" ("+
                "id_persona INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "nombre TEXT NOT NULL, "+
                "apellido TEXT NOT NULL, "+
                "email TEXT NOT NULL, "+
                "telefono TEXT NOT NULL, "+
                "direccion TEXT NOT NULL, "+
                "anios_experiencia TEXT NOT NULL)");

        db.execSQL("CREATE TABLE "+ TABLA_CLIENTE+" ("+
                "id_persona INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "nombre TEXT NOT NULL, "+
                "apellido TEXT NOT NULL, "+
                "email TEXT NOT NULL, "+
                "telefono TEXT NOT NULL, "+
                "direccion TEXT NOT NULL, "+
                "contrasenia TEXT NOT NULL)");

        db.execSQL("CREATE TABLE "+ TABLA_SUBASTA+" ("+
                "id_subasta INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "nombre TEXT NOT NULL, "+
                "apellido TEXT NOT NULL, "+
                "email TEXT NOT NULL, "+
                "telefono TEXT NOT NULL, "+
                "direccion TEXT NOT NULL, "+
                "contrasenia TEXT NOT NULL)");

        db.execSQL("CREATE TABLE "+ TABLA_OFERTA+" ("+
                "id_oferta INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "id_subasta INTEGER ,"+
                "id_proveedor INTEGER ,"+
                "percioOferta REAL NOT NULL, "+
                "fecha TEXT NOT NULL, "+
                "descripcion_oferta TEXT NOT NULL, "+
                "estado TEXT NOT NULL, "+
                "FOREIGN KEY(id_proveedor) REFERENCES "+TABLA_PROVEEDOR+" (id_persona),"+
                "FOREIGN KEY(id_subasta)REFERENCES "+TABLA_SUBASTA+" (id_persona))");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE "+ TABLA_PROVEEDOR);
        onCreate(db);
    }
}
