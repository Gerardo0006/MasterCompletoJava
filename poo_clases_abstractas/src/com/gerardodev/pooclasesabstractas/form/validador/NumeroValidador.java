package com.gerardodev.pooclasesabstractas.form.validador;

public class NumeroValidador extends Validador{
    //Implementación de atributos propios de la clase
    private String mensaje = "El campo debe ser un número";

    //Implementación de métodos heredados de la clase abstracta padre
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
        //Implementación de tryCatch para manejo de errores
        try{
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
