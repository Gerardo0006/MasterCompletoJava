package com.gerardodev.pooclasesabstractas.form.elementos.select;

public class Opcion {
    //Definición/Declaración de atributos propios de la clase
    private String valor;
    private String nombre;
    private boolean selected;

    //Implementando método constructor
    public Opcion(){
    }
    public Opcion(String valor, String nombre){
        this.valor = valor;
        this.nombre = nombre;
    }

    //Implementación métodos getter & setter
    public String getValor(){
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    //Implementando sobrecarga de Método
    public Opcion setSelected() {
        this.selected = true;
        return this;
    }
}
