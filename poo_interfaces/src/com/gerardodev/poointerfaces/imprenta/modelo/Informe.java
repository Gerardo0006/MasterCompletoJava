package com.gerardodev.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{
    //Implementación de atributos propios de la clase
    private Persona autor;
    private Persona revisor;

    //Implementación de método constructor
    public Informe(Persona autor, Persona revisor, String contenido){
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    //Implementación de sobreescritura de método abstracto de la clase abstracta padre 'Hoja'
    @Override
    public String imprimir() {
        return "El autor del informe es: " + autor +
                "\nEl revisor del informe es: " + revisor +
                "\nContenido:\n" + this.contenido;
    }
}
