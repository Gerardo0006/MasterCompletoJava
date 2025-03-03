package com.gerardodev.pooclasesabstractas.form.validador;

abstract public class Validador {
    //Definimos atributos propios de la clase abstracta
    protected String mensaje;

    //Definimos los Métodos abstractos de la clase abstracta
    abstract public void setMensaje(String mensaje);
    abstract public String getMensaje();
    abstract public boolean esValido(String valor);
}
