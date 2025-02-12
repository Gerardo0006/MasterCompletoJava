package com.gerardodev.pooherencia;

public class AlumnoInternacional extends Alumno {
    //Definimos los atributos propios de ésta clase
    private String pais;
    private double califIdiomas;

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
