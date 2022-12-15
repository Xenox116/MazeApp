package com.example.mazeapp.GUI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.mazeapp.R;
import com.example.mazeapp.SQLServer.ServerController;
import com.example.mazeapp.SQLite.DBHelper;

public class Login extends AppCompatActivity {
    Button btAcceder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        //
        DBHelper.liteConn = new DBHelper(getApplicationContext());

        ServerController conn = new ServerController();

        Toast.makeText(getApplicationContext(), conn.getError(), Toast.LENGTH_SHORT).show();
        //
        setContentView(R.layout.activity_login);
        btAcceder = findViewById(R.id.btAcceder);
    }

    public void login(View v){
        Intent opc = new Intent(getApplicationContext(), Opciones.class);
        startActivity(opc);
    }
}