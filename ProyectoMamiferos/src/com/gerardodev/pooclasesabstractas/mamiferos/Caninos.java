package com.gerardodev.pooclasesabstractas.mamiferos;

abstract public class Caninos extends Mamiferos{
    //Implementación de atributos propios de la clase
    protected String color;
    protected float tamColmillos;

    //Implementación de Métodos constructor
    public Caninos(String color, float tamColmillos, String habitat, float altura, float largo, float peso){
        super(habitat, altura, largo, peso);
        this.color = color;
        this.tamColmillos = tamColmillos;
    }

    //Implementación de Métodos Getter
    public String getColor(){
        return color;
    }
    public float getTamColmillos(){
        return tamColmillos;
    }
}
