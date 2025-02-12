package com.gerardodev.pooherencia;

public class Profesor extends Persona {
    //Declaración de atributos propios de ésta clase
    private String materia;

    //Implementación de métodos getter & setter
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
}
