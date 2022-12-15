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

import com.example.mazeapp.R;

public class Opciones extends AppCompatActivity {
    String user;
    Button btMenu;
    ImageButton btFin;
    LinearLayout l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
        getSupportActionBar().hide();
        //if(String user == null)//abre login;{
        l1 = findViewById(R.id.l1);
        btMenu = findViewById(R.id.btCrear);
        btFin = findViewById(R.id.btVolver);
    }
    public void volver(View v){ finish();}
    public void menu(View v){
        Intent opc = new Intent(getApplicationContext(), CrearComanda.class);
        startActivity(opc);
    }
}