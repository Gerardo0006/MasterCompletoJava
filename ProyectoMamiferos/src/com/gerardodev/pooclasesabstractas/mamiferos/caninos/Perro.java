package com.gerardodev.pooclasesabstractas.mamiferos.caninos;

public class Perro extends Caninos{
    //Implementación de atributos propios de la clase
    private int fuerzaMordida;
    private String raza;
    private int velocidad;

    //Implementación de Método constructor
    public Perro(int fuerzaMordida, String raza, int velocidad, String color, int tamColmillos, String habitat, float altura, float largo, float peso){
        super(color, tamColmillos, habitat, altura, largo, peso);
        this.fuerzaMordida = fuerzaMordida;
        this.raza = raza;
        this.velocidad = velocidad;
    }

    //Implementación de Método Getter
    public int getFuerzaMordida(){
        return fuerzaMordida;
    }
    public String getRaza(){
        return raza;
    }
    public int getVelocidad(){
        return velocidad;
    }

    //Implementación de Métodos abstractos de la clase abstracta padre 'Caninos'
    @Override
    public String comer() {
        return "El perro " + raza + " de color " +  color + " come croquetas y carne.";
    }

    @Override
    public String dormir() {
        return "El perro " + raza + " duerme durante la noche.";
    }

    @Override
    public String correr() {
        return "El perro " + raza + " corre a una velocidad de " + velocidad + "km/h.";
    }

    @Override
    public String comunicarse() {
        return "El perro " + raza + " se comunica a través de ladridos.";
    }
}
