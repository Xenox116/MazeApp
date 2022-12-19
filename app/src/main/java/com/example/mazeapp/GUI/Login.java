package com.example.mazeapp.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mazeapp.R;
import com.example.mazeapp.SQLServer.ServerController;
import com.example.mazeapp.SQLite.DBHelper;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

public class Login extends AppCompatActivity {
    Button btAcceder;

    public static int userId;

    EditText etUser;
    EditText etPassw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DBHelper.liteConn = new DBHelper(getApplicationContext());
        new ServerController();
        //
        setContentView(R.layout.activity_login);
        btAcceder = findViewById(R.id.btAcceder);
        etUser = findViewById(R.id.etUser);
        etPassw = findViewById(R.id.etPassw);
    }

    public void login(View v) {
        String user = etUser.getText().toString().trim();
        String passw = etPassw.getText().toString().trim();

        if (user.equals("") || passw.equals("")){
            Toast.makeText(getApplicationContext(), "No puede haber campos vacios", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            Statement statement = ServerController.serverConn.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("select * from Usuarios where " +
                            "Usuario ='" + user + "' And " +
                            "Password ='" + passw + "'");
            boolean res = false;

            while (resultSet.next()) {
                userId = resultSet.getInt("IdUsuario");
                res = true;
            }
            if (res) {
                Intent opc = new Intent(getApplicationContext(), Opciones.class);
                startActivity(opc);

                Toast.makeText(getApplicationContext(), "Bienvenido " + user + userId, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrecta", Toast.LENGTH_SHORT).show();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}