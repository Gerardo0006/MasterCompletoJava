package com.gerardodev.poointerfaces.proyectoCatalogo.clasesConcretas;

import com.gerardodev.poointerfaces.proyectoCatalogo.clasesAbstractas.Electronico;
import com.gerardodev.poointerfaces.proyectoCatalogo.interfaces.IProducto;

public class IPhone extends Electronico {
    //Implementación de atributos propios de la clase Iphone
    private String color;
    private String modelo;

    //Implementación de Método Constructor
    public IPhone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    //Implementación de métodos getter
    public String getColor() {
        return color;
    }
    public String getModelo() {
        return modelo;
    }

    //Implementación de sobreescritura de método heredado de la interfaz
    @Override
    public double getPrecioVenta() {
        return getPrecio() * 1.25;
    }
}
