package com.gerardodev.pooclasesabstractas.form.validador;

public class LargoValidador extends Validador{
    //Declaración de atributos propios de ésta clase
    protected String mensaje = "El campo debe tener mínimo %d caracteres y máximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    //Implementación de Métodos constructores para asignar min y max
    public LargoValidador(){ //Constructor vacío para asignar valores con métodos setter

    }
    public LargoValidador(int min, int max){
        this.min = min;
        this.max = max;
    }

    //Implementación de métodos setter
    public void setMin(int min){
        this.min = min;
    }
    public void setMax(int max){
        this.max = max;
    }

    //Implementación de Métodos abstractos de la clase Padre abstracta Validador
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
        this.mensaje = String.format(this.mensaje, this.min, this.max);
        //Implementación de validación del rango de caracteres
        if (valor == null){
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <= max);
    }
}
