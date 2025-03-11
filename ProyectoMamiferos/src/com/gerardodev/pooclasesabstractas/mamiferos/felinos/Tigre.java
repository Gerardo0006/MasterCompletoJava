package com.gerardodev.pooclasesabstractas.mamiferos.felinos;

public class Tigre extends Felinos{
    //Implementación de atributos propios de la clase
    protected String especieTigre;

    //Implementación de Métodos Constructores
    public Tigre(String especieTigre, float tamGarras, int velocidad, String habitat, float altura, float largo, float peso){
        super(tamGarras, velocidad, habitat, altura, largo, peso);
        this.especieTigre = especieTigre;
    }

    //Implementación de Métodos Getter
    public String getEspecieTigre(){
        return especieTigre;
    }

    //Implementación de Sobreescritura de Métodos abstractos heredados de la clase abstracta padre 'Felinos'
    @Override
    public String comer() {
        return "El tigre de la raza " + especieTigre + " caza solitario en " + habitat + " durante las noches.";
    }
    @Override
    public String dormir() {
        return "El tigre " + especieTigre + " duerme durante 16 horas diarias.";
    }
    @Override
    public String correr() {
        return "El tigre " + especieTigre + " corre a una velocidad máxima de " + velocidad + "km/h.";
    }
    @Override
    public String comunicarse() {
        return "El tigre " + especieTigre + " se comunica con ronroneos y gruñidos.";
    }
}
