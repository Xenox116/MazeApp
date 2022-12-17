package com.example.mazeapp.entidades;

public class Producto {
    int Codigo;
    int Pedido;
    String Nombre;

    public Producto(int cod, int ped, String nom){
        Codigo=cod;
        Pedido=ped;
        Nombre=nom;
    }

    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public int getPedido() {
        return Pedido;
    }
    public void setPedido(int pedido) {
        Pedido = pedido;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
