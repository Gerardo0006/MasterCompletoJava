package com.gerardodev.app.hogar;

public class Persona {
    //Definimos atributo
    private String nombre;
    private String apellido;
    private ColorPelo colorPelo; //Definimos atributo de tip ColorPelo

    //Definimos constantes final
    public static final String GENERO_FEMENINO = "Mujer";
    public static final String GENERO_MASCULINO = "Hombre";

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
    //Implementando métodos getter & setter para colorPelo
    public ColorPelo getColorPelo() {
        return colorPelo;
    }
    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    //Implementando método publico para interactuar con Perro
    public String lanzarPelota(){
        return this.nombre + "\nLanzar la pelota!";
    }

    //Implementamos método publico saludar
    public static String saludar(){
        return "Hola qué tal?";
    }
}
