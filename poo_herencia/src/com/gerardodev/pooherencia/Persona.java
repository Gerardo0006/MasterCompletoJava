package com.gerardodev.pooherencia;

public class Persona {
    //Declaramos los atributos de la clase Persona (clase padre)
    private String nombre;
    private String apellido;
    private String email;
    private int edad;

    //Implementación de método constructor (sin parámetros)
    /*Siempre que mandamos llamar al método constructor de una clase hija que hereda de una
    * clase padre, se manda a llamar primero al método constructor de la clase padre, luego
    * el de la clase hija.*/
    public Persona() {
        System.out.println("Persona inicializando constructor...");
    }

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
