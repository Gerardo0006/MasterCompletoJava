package com.gerardodev.pooclasesabstractas.mamiferos;

abstract class Mamiferos {
    //Implementación de atributos propios de la clase
    protected String habitat;
    protected float altura;
    protected float largo;
    protected float peso;
    protected String nombreCientifico;

    //Implementación de métodos Constructor
    public Mamiferos(String habitat, float altura, float largo, float peso, String nombreCientifico){
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }
    public Mamiferos(String habitat, float altura, float largo, float peso){
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
    }
    public Mamiferos(){
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
