package com.gerardodev.pooclasesabstractas.mamiferos.felinos;

public class Leon extends Felinos{
    //Implementación de atributos propios de la clase
    private int numManada;
    private float potenciaRugido;

    //Implementamos Método constructor
    public Leon(int numManada, float potenciaRugdo, float tamGarras, int velocidad, String habitat, float altura, float largo, float peso){
        super(tamGarras, velocidad, habitat, altura, largo, peso);
        this.numManada = numManada;
        this.potenciaRugido = potenciaRugdo;
    }

    //Implementación Métodos Getter
    public int getNumManada(){
        return numManada;
    }
    public float getPotenciaRugido(){
        return potenciaRugido;
    }

    //Implementación de Sobreescritura de Métodos abstractos heredados de la clase abstracta padre 'Felinos'
    @Override
    public String comer() {
        return "El león caza con su manada de " + numManada + " leones en la sabana africana.";
    }
    @Override
    public String dormir() {
        return "El león duerme en la sabana africana.";
    }
    @Override
    public String correr() {
        return "El león corre a una velocidad de " + velocidad + " km/h.";
    }
    @Override
    public String comunicarse() {
        return "El león ruge con una potencia de " + potenciaRugido + " decibeles.";
    }
}
