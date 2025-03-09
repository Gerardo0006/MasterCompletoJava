package com.gerardodev.pooclasesabstractas.mamiferos;

public class Mamiferos {
    //Implementación de atributos propios de la clase
    protected String habitat;
    protected double altura;
    protected double peso;
    protected String nombreCientifico;

    //Implementación de método Constructor
    public Mamiferos(String habitat, double altura, double peso, String nombreCientifico){
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    //Implementación de Métodos Getter
    public String getHabitat(){
        return habitat;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }
    public String getNombreCientifico(){
        return nombreCientifico;
    }

    //Implementación de Métodos abstractos
    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();
}
