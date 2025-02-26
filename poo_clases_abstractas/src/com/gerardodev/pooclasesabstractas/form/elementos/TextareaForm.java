package com.gerardodev.pooclasesabstractas.form.elementos;

public class TextAreaForm extends ElementoForm{
    //Declaración de atributos
    private int filas;
    private int columnas;

    //Implementación de métodos constructores
    public TextAreaForm(String nombre) {
        super(nombre);
    }
    public TextAreaForm(String nombre, int filas, int columnas){
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    //Implementación de métodos getter & setter
    public void setFilas(int filas){
        this.filas = filas;
    }
    public int getFilas(){
        return filas;
    }
    public void setColumnas(int columnas){
        this.columnas = columnas;
    }
    public int getColumnas(){
        return columnas;
    }


    //Las clases que heredan/extienden de clases abstractas deben tener implementados sus métodos abstractos
    @Override
    public String dibujarHtml() {
        return "<textarea name=\"" + this.nombre
                + "\" cols=\"" + this.columnas
                + "\" rows=\"" + this.filas + ">" + this.valor + "</textarea>";
    }
}
