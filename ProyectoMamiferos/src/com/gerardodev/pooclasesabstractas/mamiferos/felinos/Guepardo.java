package com.gerardodev.pooclasesabstractas.mamiferos.felinos;

public class Guepardo extends Felinos{
    //Implementación de atributos propios de la clase Guepardo
    //Ésta clase no tiene atributos propios

    //implementación de método constructor
    public Guepardo(float tamGarras, int velocidad, String habitat, float altura, float largo, float peso){
        super(tamGarras, velocidad, habitat, altura, largo, peso);
    }

    //Implementación de Métodos abstractos de la clase abstracta padre 'Felinos'
    @Override
    public String comer() {
        return "El Guepardo caza junto a su grupo en las llanuras africanas, con un mordida mucho inferior a los demás felinos grandes.";
    }
    @Override
    public String dormir() {
        return "El Guepardo en la sabana africana.";
    }
    @Override
    public String correr() {
        return "El Guepardo corre a una velocidad máxima de " + velocidad + "km/h";
    }
    @Override
    public String comunicarse() {
        return "El Guepardo se comunica mediante una serie de sonidos peculiares, como ronroneos, gruñidos y chillidos agudos.";
    }
}
