package com.example.mazeapp.GUI;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.mazeapp.R;

public class HistorialComandas extends AppCompatActivity {
    ImageButton btsalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial_comandas);
        btsalir = findViewById(R.id.btsalir);
    }
    public void salir(View v){ finish();}
}