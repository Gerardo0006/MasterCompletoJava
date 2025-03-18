package com.gerardodev.poointerfaces.imprenta.modelo;

public class Persona {
    //Atributos propios de la clase Persona
    private String nombre;
    private String apellido;

    //Implementación de Métodos Constructores
    public Persona(){
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Implementación de Métodos Getter & Setter
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    //Implementación de sobreescritura de Método toString();
    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
