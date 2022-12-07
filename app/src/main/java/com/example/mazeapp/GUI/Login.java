package com.example.mazeapp.GUI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.mazeapp.R;

public class Login extends AppCompatActivity {
    Button btAcceder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        btAcceder = findViewById(R.id.btAcceder);
    }

    public void login(View v){
        Intent opc = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(opc);
    }
}