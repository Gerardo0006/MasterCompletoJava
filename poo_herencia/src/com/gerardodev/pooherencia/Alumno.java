package com.gerardodev.pooherencia;

public class Alumno extends Persona {
    //Declaración de atributos propios de ésta clase
    private String escuela;
    private double califMatematicas;
    private double califEspaniol;
    private double califHistoria;

    //Implementación de método constructor (sin parámetros)
    /*Siempre que mandamos llamar al método constructor de una clase hija que hereda de una
     * clase padre, se manda a llamar primero al método constructor de la clase padre, luego
     * el de la clase hija.*/
    public Alumno() {
        System.out.println("Alumno inicializando constructor...");
    }

    //Implementación de métodos getter & setter
    public String getEscuela() {
        return escuela;
    }
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    public double getCalifMatematicas() {
        return califMatematicas;
    }
    public void setCalifMatematicas(double califMatematicas) {
        this.califMatematicas = califMatematicas;
    }
    public double getCalifEspaniol() {
        return califEspaniol;
    }
    public void setCalifEspaniol(double califEspaniol) {
        this.califEspaniol = califEspaniol;
    }
    public double getCalifHistoria() {
        return califHistoria;
    }
    public void setCalifHistoria(double califHistoria) {
        this.califHistoria = califHistoria;
    }
}
