package com.gerardodev.pooclasesabstractas.form.validador;

public class NoNuloValidador extends Validador{
    //Implementación de atributos propios de ésta clase
    protected String mensaje = "El campo no puede ser nulo";


    //Implementación de métodos de la clase Padre abstracta
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
        return (valor != null);
    }
}
