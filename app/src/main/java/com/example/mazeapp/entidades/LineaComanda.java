package com.example.mazeapp.entidades;

import java.time.LocalDate;

public class LineaComanda {
    public int IdComanda;
    public int IdProducto;
    public int Cantidad;
    public double Precio;
    public LocalDate Fecha;

    public LineaComanda(int idComanda, int idProducto, int cantidad, double precio, LocalDate fecha) {
        IdComanda = idComanda;
        IdProducto = idProducto;
        Cantidad = cantidad;
        Precio = precio;
        Fecha = fecha;
    }
}
