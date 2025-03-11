package com.gerardodev.pooclasesabstractas.mamiferos.felinos;

import com.gerardodev.pooclasesabstractas.mamiferos.Mamiferos;

abstract public class Felinos extends Mamiferos {
    //Implementación de atributos propios de la clase
    protected float tamGarras;
    protected int velocidad;

    //implementación de Método Constructor
    public Felinos(float tamGarras, int velocidad, String habitat, float altura, float largo, float peso){
        super(habitat, altura, largo, peso);
        this.tamGarras = tamGarras;
        this.velocidad = velocidad;
    }

    //Implementación de Métodos Getter
    public float getTamGarras(){
        return tamGarras;
    }
    public int getVelocidad(){
        return velocidad;
    }
}
