package com.gerardodev.pooclasesabstractas.form.validador;

public class RequeridoValidador extends Validador{
    //Implementación de atributo propio de ésta clase
    private String mensaje = "El campo %s es requerido";

    //Implementación de Métodos de la clase abstracta Padre
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    @Override
    public String getMensaje() {
        return mensaje;
    }
    @Override
    public boolean esValido(String valor) {
        return (valor != null && valor.length() > 0);
    }
}
