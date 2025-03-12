package com.gerardodev.poointerfaces.imprenta.modelo;

public class Informe extends Hoja{
    //Implementación de atributos propios de la clase
    private String autor;
    private String revisor;

    //Implementación de método constructor
    public Informe(String autor, String revisor, String contenido){
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
