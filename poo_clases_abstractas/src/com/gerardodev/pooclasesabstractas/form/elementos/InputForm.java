package com.gerardodev.pooclasesabstractas.form;

public class InputForm extends ElementoForm{
    //Definición de atributos
    private String tipo = "text";

    //Implementación de métodos constructores
    public InputForm(String nombre){
        super(nombre);
    }
    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    //Implementación de métodos getter & setter
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    //Las clases que heredan/extienden de clases abstractas deben tener implementados sus métodos abstractos
    @Override
    public String dibujarHtml(){
        return "<input type=\"" + this.tipo
                + "\" name=\"" + this.nombre
                + "\" value=\"" + this.valor + "\">";
    }
}
