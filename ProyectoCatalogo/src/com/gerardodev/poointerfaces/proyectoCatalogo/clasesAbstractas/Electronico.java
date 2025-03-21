package com.gerardodev.poointerfaces.proyectoCatalogo.clasesAbstractas;

import com.gerardodev.poointerfaces.proyectoCatalogo.interfaces.IElectronico;

public abstract class Electronico extends Producto implements IElectronico {
    //Implementación de los atributos propios de ésta clase abstracta
    private String fabricante;

    //Implementación de Método Constructor
    public Electronico(int precio, String fabricante){
        super(precio);
        this.fabricante = fabricante;
    }

    //Implementación de sobreescritura de Método getter
    @Override
    public String getFabricante(){
        return fabricante;
    }
}