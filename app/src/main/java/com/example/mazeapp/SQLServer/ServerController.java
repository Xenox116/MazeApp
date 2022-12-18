package com.example.mazeapp.SQLServer;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;

public class ServerController {
    public static Connection serverConn;

    private String error = "OK";

    //private String ip = "192.168.1.112";
    private String ip = "192.168.1.134"; //ip de PC Jie
    //private String ip = "192.168.1.115"; //portatil Jie
    //private String ip="192.168.56.1"; //ip olatz
    private String port = "1433";
    private String db = "MAZE";
    private String user = "user";
    private String password = "1234";

    public ServerController() {
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            serverConn = DriverManager
                    .getConnection("jdbc:jtds:sqlserver://"+ip+":"+port+"/"+db, user, password);
        } catch (Exception ex) {
            error = ex.getMessage();
        }
    }

    public String getError() {
        return this.error;
    }
}