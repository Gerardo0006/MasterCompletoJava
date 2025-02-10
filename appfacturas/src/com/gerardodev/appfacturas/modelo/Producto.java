package com.gerardodev.appfacturas.modelo;

public class Producto {
    //Declaramos los atributos
    private int codigo;
    private String nombre;
    private float precio;
    private static int ultimoCodigo;

    //Implementamos método constructor vacío
    public Producto() {
        this.codigo = ++ultimoCodigo;
    }

    //Implementamos métodos getter & setter
    public int getCodigo() {
        return codigo; //Solamente usamos método get ya que idealmente el código de producto no se modifica
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //Implementamos la sobreescritura del método toString
    @Override
    public String toString() {
        return codigo + "\t" + nombre + "\t" + precio;
    }
}
