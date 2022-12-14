package com.example.mazeapp.GUI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.mazeapp.R;
import com.example.mazeapp.SQLServer.ServerController;
import com.example.mazeapp.SQLite.DBHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper.liteConn = new DBHelper(getApplicationContext());

        ServerController conn = new ServerController();

        Toast.makeText(getApplicationContext(), conn.getError(), Toast.LENGTH_SHORT).show();
    }
}