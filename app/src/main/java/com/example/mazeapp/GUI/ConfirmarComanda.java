package com.example.mazeapp.GUI;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mazeapp.R;
import com.example.mazeapp.SQLServer.ServerController;
import com.example.mazeapp.entidades.LineaComanda;
import com.example.mazeapp.entidades.Producto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ConfirmarComanda extends AppCompatActivity {
    ImageButton btsalir2;
    ListView listaComanda;
    ArrayList<LineaComanda> lineasComanda = new ArrayList<>();
    ArrayList<String> productosShow = new ArrayList<>();

    Date now;

    Statement statement;

    int pos=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_comanda);
        btsalir2 = findViewById(R.id.btsalir2);

        try {
            statement = ServerController.serverConn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        listaComanda = findViewById(R.id.listaComanda);
        listaComanda.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                pos = i;
            }
        });

        now = Calendar.getInstance().getTime();

        cargarListView();
    }

    private void cargarListView() {
        for (Producto item :
                CrearComanda.comanda) {
            lineasComanda.add(new LineaComanda(0, item.getCodigo(), item.getNombre(), item.getPedido(), item.getPedido() * item.getPrecio(), now));
        }

        for (LineaComanda item :
                lineasComanda) {
            productosShow.add(item.Nombre + " " + item.Cantidad + " ud. " + item.Precio + "€");
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, productosShow);
        listaComanda.setAdapter(adapter);
    }

    public void salir2(View v) {
        finish();
    }

    public void enviarComanda(View v) {
        enviar();
    }

    private void enviar() {
        int id = (int) (Math.random() * 100000);
        java.sql.Date fecha = new java.sql.Date(now.getTime());
        Log.d("*********", fecha.toString());
        try {
            statement.execute("insert into Comandas values(" + id + "," + fecha + ",2," + Login.userId + ",0 )");
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }
        for (LineaComanda item :
                lineasComanda) {
            try {
                statement.execute("insert into LineasComanda values(" + id + ", " + item.IdProducto + "," + item.Cantidad + "," + item.Precio + "," + fecha + ")");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        Toast.makeText(getApplicationContext(),"comando enviado",Toast.LENGTH_SHORT).show();
        CrearComanda.me.finish();
        this.finish();
    }

    public void borrar(View v){
        CrearComanda.comanda.remove(pos);

        lineasComanda = new ArrayList<>();
        productosShow = new ArrayList<>();
        cargarListView();
    }

}