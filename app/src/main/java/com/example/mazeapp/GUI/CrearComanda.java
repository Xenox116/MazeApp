package com.example.mazeapp.GUI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;

import android.text.InputType;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mazeapp.R;
import com.example.mazeapp.entidades.Producto;

import java.util.ArrayList;

public class CrearComanda extends AppCompatActivity {
    ArrayList<Producto> comanda=new ArrayList<>();
    Button addcafeleche,addcapuccino,adddescafe,addespreso,addcoca,addfanta,addaquarius,addbitterkas,addfresa,
        addvainilla,addchocolte,addarrozleche,addredvelvet,addbizcocho,addflan,addnegro,addrojo,addteleche,
        addverde,addgilda,addmoruno,addjamon,addtortilla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_comanda);

        addcafeleche=findViewById(R.id.add1);
        addcafeleche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(6,"Cafe con leche");
                addcafeleche.setEnabled(false);
            }
        });
        addcapuccino=findViewById(R.id.add2);
        addcapuccino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(8,"Capuccino");
                addcapuccino.setEnabled(false);
            }
        });
        adddescafe=findViewById(R.id.add3);
        adddescafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(7,"Descafeinado");
                adddescafe.setEnabled(false);
            }
        });
        addespreso=findViewById(R.id.add4);
        addespreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(9,"Espresso");
                addespreso.setEnabled(false);
            }
        });
        addcoca=findViewById(R.id.add5);
        addcoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(1,"CocaCola");
                addcoca.setEnabled(false);
            }
        });
        addfanta=findViewById(R.id.add6);
        addfanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(3,"Fanta naranja");
                addfanta.setEnabled(false);
            }
        });
        addaquarius=findViewById(R.id.add7);
        addaquarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(2,"Aquarius");
                addaquarius.setEnabled(false);
            }
        });
        addbitterkas=findViewById(R.id.add8);
        addbitterkas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(4,"Bitter Kas");
                addbitterkas.setEnabled(false);
            }
        });
        addfresa=findViewById(R.id.add9);
        addfresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(22,"Batido Fresa");
                addfresa.setEnabled(false);
            }
        });
        addvainilla=findViewById(R.id.add10);
        addvainilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(23,"Batido Vainilla");
                addvainilla.setEnabled(false);
            }
        });
        addchocolte=findViewById(R.id.add11);
        addchocolte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(21,"Batido Chocolate");
                addchocolte.setEnabled(false);
            }
        });
        addarrozleche=findViewById(R.id.add12);
        addarrozleche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(20,"Arroz leche");
                addarrozleche.setEnabled(false);
            }
        });
        addredvelvet=findViewById(R.id.add13);
        addredvelvet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(16,"Red Velvet");
                addredvelvet.setEnabled(false);
            }
        });
        addbizcocho=findViewById(R.id.add14);
        addbizcocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(17,"Bizcochocolate");
                addbizcocho.setEnabled(false);
            }
        });
        addflan=findViewById(R.id.add17);
        addflan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(19,"Flan");
                addflan.setEnabled(false);
            }
        });
        addnegro=findViewById(R.id.add18);
        addnegro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(26,"Te Negro");
                addnegro.setEnabled(false);
            }
        });
        addrojo=findViewById(R.id.add19);
        addrojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(27,"Te Rojo");
                addrojo.setEnabled(false);
            }
        });
        addteleche=findViewById(R.id.add20);
        addteleche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(29,"Te Leche");
                addteleche.setEnabled(false);
            }
        });
        addverde=findViewById(R.id.add21);
        addverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(25,"Te Verde");
                addverde.setEnabled(false);
            }
        });
        addgilda=findViewById(R.id.add22);
        addgilda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(14,"Gilda");
                addgilda.setEnabled(false);
            }
        });
        addmoruno=findViewById(R.id.add23);
        addmoruno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(15,"Moruno");
                addmoruno.setEnabled(false);
            }
        });
        addjamon=findViewById(R.id.add24);
        addjamon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(13,"Jamon");
                addjamon.setEnabled(false);
            }
        });
        addtortilla=findViewById(R.id.add25);
        addtortilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                hacerPedido(12,"Tortilla");
                addtortilla.setEnabled(false);
            }
        });
    }

    private void hacerPedido(int cod, String nom) {
        int[] pedido = new int[1];
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(CrearComanda.this);
        final EditText edittext = new EditText(CrearComanda.this);
        edittext.setInputType(InputType.TYPE_CLASS_NUMBER);
        alertDialog.setTitle("Pedido");
        alertDialog.setMessage("Inserte la cantidad a pedir");
        alertDialog.setView(edittext);
        edittext.setText("1");
        alertDialog.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                String Strpedido = edittext.getText().toString();
                pedido[0] =Integer.parseInt(Strpedido.toString());
                Producto p1=new Producto(cod,pedido[0],nom);
                comanda.add(p1);
                Log.i("CrearComanda", "Finalizado");
            }
        });
        alertDialog.show();
    }

}