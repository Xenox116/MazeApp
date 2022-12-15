package com.example.mazeapp.GUI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.mazeapp.R;
import com.example.mazeapp.SQLServer.ServerController;
import com.example.mazeapp.SQLite.DBHelper;

public class Opciones extends AppCompatActivity {
    String user;
    Button btCrear;
    ImageButton btVolver;
    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
        //if(String user == null)//abre login;{
        l1 = findViewById(R.id.l1);
        btCrear = findViewById(R.id.btCrear);
        btVolver = findViewById(R.id.btVolver);
    }
    public void volver(View v){ finish();}
    public void menu(View v){
        Intent opc = new Intent(getApplicationContext(), CrearComanda.class);
        startActivity(opc);
    }
}