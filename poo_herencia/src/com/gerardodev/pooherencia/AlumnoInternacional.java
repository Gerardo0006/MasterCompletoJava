package com.gerardodev.pooherencia;

public class AlumnoInternacional extends Alumno {
    //Definimos los atributos propios de ésta clase
    private String pais;
    private double califIdiomas;

    //Implementación de método constructor (sin parámetros)
    /*Siempre que mandamos llamar al método constructor de una clase hija que hereda de una
     * clase padre, se manda a llamar primero al método constructor de la clase padre, luego
     * el de la clase hija.*/
    public AlumnoInternacional() {
        System.out.println("AlumnoInternacional inicializando constructor...");
    }

    //Implementamos métodos getter & setter
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public double getCalifIdiomas() {
        return califIdiomas;
    }
    public void setCalifIdiomas(double califIdiomas) {
        this.califIdiomas = califIdiomas;
    }
}
