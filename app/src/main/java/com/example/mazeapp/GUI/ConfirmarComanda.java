package com.example.mazeapp.GUI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.mazeapp.R;

public class ConfirmarComanda extends AppCompatActivity {
    ImageButton btsalir2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_comanda);
        btsalir2 = findViewById(R.id.btsalir2);
    }
    public void salir2(View v){finish();}
}