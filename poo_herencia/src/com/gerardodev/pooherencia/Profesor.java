package com.gerardodev.pooherencia;

public class Profesor extends Persona {
    //Declaración de atributos propios de ésta clase
    private String materia;

    //Implementación de método constructor (sin parámetros)
    /*Siempre que mandamos llamar al método constructor de una clase hija que hereda de una
     * clase padre, se manda a llamar primero al método constructor de la clase padre, luego
     * el de la clase hija.*/
    public Profesor() {
        System.out.println("Profesor inicializando constructor...");
    }

    //Implementación de métodos getter & setter
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
}
