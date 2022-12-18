package com.example.mazeapp.entidades;

import java.time.LocalDate;

public class LineaComanda {
    public int IdComanda;
    public int IdProducto;
    public String Nombre;
    public int Cantidad;
    public double Precio;
    public LocalDate Fecha;

    public LineaComanda(int idComanda, int idProducto, String nombre, int cantidad, double precio, LocalDate fecha) {
        IdComanda = idComanda;
        IdProducto = idProducto;
        Nombre = nombre;
        Cantidad = cantidad;
        Precio = precio;
        Fecha = fecha;
    }
}
