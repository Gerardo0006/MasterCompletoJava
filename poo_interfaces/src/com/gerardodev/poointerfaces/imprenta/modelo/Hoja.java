package com.gerardodev.poointerfaces.imprenta.modelo;

abstract public class Hoja {
    //Implementación de atributos propios de la clase
    protected String contenido;

    //Implementación de método constructor
    public Hoja(String contenido){
        this.contenido = contenido;
    }

    //Declaración de método abstracto
    abstract public String imprimir();
}
