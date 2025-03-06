package com.gerardodev.pooclasesabstractas.form.elementos;

import com.gerardodev.pooclasesabstractas.form.validador.LargoValidador;
import com.gerardodev.pooclasesabstractas.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {
    //Declaración de atributos de la clase
    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    //Implementación de métodos Constructores
    public ElementoForm(){ //Constructor vacío
        //Inicializamos los List en este constructor
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }
    public ElementoForm(String nombre){
        this();
        this.nombre = nombre;
    }

    //Implementación de método para agregar validador
    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    //Implementación de método get para obtener errores
    public List<String> getErrores(){
        return errores;
    }

    //Implementación de método para verificar si el campo es válido
    public boolean esValido(){
        for(Validador v : validadores){
            if (!v.esValido(this.valor)) {
                if (v instanceof LargoValidador) {
                    this.errores.add(((LargoValidador) v).getMensjaeFormateado(nombre));
                } else {
                    this.errores.add(String.format(v.getMensaje(), nombre));
                }
            }
        }
        return this.errores.isEmpty();
    }

    //Implementación de Método Setter
    public void setValor(String valor){
        this.valor = valor;
    }

    //Declaraciión de métodos
    abstract public String dibujarHtml(); //Los métodos abstractos no llevan {}
}
