package com.gerardodev.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador{
    //Implementación de atributos propios de la clase
    protected String mensaje = "El formato del email NO es válido";

    //Validación del correo utilizando expresiones regulares
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

    //Implementación de Métodos abstractos de la clase abstracta Padre
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
        return valor.matches(EMAIL_REGEX); //Validamos que el valor empate con la expresión regular
    }
}
