package com.gerardodev.pooclasesabstractas.mamiferos.caninos;

public class Lobo extends Caninos{
    //Implementación de atributos propios de la clase 'Lobo'
    private int numCamada;
    private String especieLobo;

    //Implementación de Métodos Constructores
    public Lobo(int numCamada, String especieLobo, String color, float tamColmillos, String habitat, float altura, float largo, float peso){
        super(color, tamColmillos, habitat, altura, largo, peso);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    //Implementar Métodos Getter
    public int getNumCamada(){
        return numCamada;
    }
    public String getEspecieLobo(){
        return especieLobo;
    }

    //Implementación de métodos abstractos de la clase abstracta padre 'Caninos'
    @Override
    public String comer() {
        return "El lobo " + especieLobo + " caza con su manada de " + numCamada + " en " + habitat;
    }
    @Override
    public String dormir() {
        return "El lobo " + color + " duerme en su madriguera que está en " + habitat;
    }
    @Override
    public String correr() {
        return "El lobo " + especieLobo + " corre a en " + habitat;
    }
    @Override
    public String comunicarse() {
        return "El lobo " + especieLobo + " se comunica con aullidos.";
    }
}
