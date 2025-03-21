package com.gerardodev.poointerfaces.proyectoCatalogo.clasesConcretas;

import com.gerardodev.poointerfaces.proyectoCatalogo.clasesAbstractas.Electronico;

public class TvLcd extends Electronico {
    //Implementación de atributos propios de la clase TvLcd
    private int pulgadas;

    //Implementación de Método constructor
    public TvLcd(int precio, String fabricante, int pulgadas){
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    //Implementación de Métodos Getter
    public int getPulgadas(){
        return pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio()*1.15; //Agregamos 15% de ganancia
    }
}