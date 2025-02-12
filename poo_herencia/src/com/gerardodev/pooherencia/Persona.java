package com.gerardodev.pooherencia;

public class Persona {
    //Declaramos los atributos de la clase Persona (clase padre)
    private String nombre;
    private String apellido;
    private String email;
    private int edad;

    //Implementación de métodos getter & setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

}
