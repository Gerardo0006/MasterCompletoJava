package com.gerardodev.pooclasesabstractas.form.elementos;

abstract public class ElementoForm {
    //Declaración de atributos de la clase
    protected String valor;
    protected String nombre;

    //Implementación de métodos Constructores
    public ElementoForm(){ //Constructor vacío
    }
    public ElementoForm(String nombre){
        this();
        this.nombre = nombre;
    }

    //Implementación de Método Setter
    public void setValor(String valor){
        this.valor = valor;
    }

    //Declaraciión de métodos
    abstract public String dibujarHtml(); //Los métodos abstractos no llevan {}
}
