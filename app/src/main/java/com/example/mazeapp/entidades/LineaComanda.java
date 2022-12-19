package com.example.mazeapp.entidades;

import java.time.LocalDate;
import java.util.Date;

public class LineaComanda {
    public int IdComanda;
    public int IdProducto;
    public String Nombre;
    public int Cantidad;
    public double Precio;
    public Date Fecha;

    public LineaComanda(int idComanda, int idProducto, String nombre, int cantidad, double precio, Date fecha) {
        IdComanda = idComanda;
        IdProducto = idProducto;
        Nombre = nombre;
        Cantidad = cantidad;
        Precio = precio;
        Fecha = fecha;
    }
}
