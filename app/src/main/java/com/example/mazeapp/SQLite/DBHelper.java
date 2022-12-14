package com.example.mazeapp.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static DBHelper liteConn;

    public static String db_name = "productos.db";

    public static String t_productos = "productos";
    public static String c_id_prod = "idProd";
    public static String c_nombre = "nombre";
    public static String c_prec = "precio";
    public static String c_cant_stock = "cantStock";


    public DBHelper(@Nullable Context context) {
        super(context, db_name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + t_productos + "(" +
                c_id_prod + " integer primary key," +
                c_nombre+ " String not null," +
                c_prec +" float not null," +
                c_cant_stock +"integer not null)");

        db.execSQL("insert into " +t_productos +" values(1, 'Patatas', 23.50, 12)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists " + t_productos);
        onCreate(db);
    }
}
