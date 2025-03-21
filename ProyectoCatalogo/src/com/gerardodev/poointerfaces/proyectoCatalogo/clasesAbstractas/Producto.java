package com.gerardodev.poointerfaces.proyectoCatalogo.clasesAbstractas;

import com.gerardodev.poointerfaces.proyectoCatalogo.interfaces.IProducto;

public abstract class Producto implements IProducto {
    //Implementación de los atributos propios de la clase
    private int precio;

    //Implementación de Método Constructor
    public Producto(int precio){
        this.precio = precio;
    }

    //Implementación de sobreescritura de Método getPrecio();
    @Override
    public int getPrecio() {
        return precio;
    }
}
