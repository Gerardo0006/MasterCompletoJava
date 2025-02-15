package com.gerardodev;

public class Profesor extends Persona {
    //Declaración de atributos propios de ésta clase
    private String materia;

    //Implementación de método constructor (sin parámetros)
    /*Siempre que mandamos llamar al método constructor de una clase hija que hereda de una
     * clase padre, se manda a llamar primero al método constructor de la clase padre, luego
     * el de la clase hija.*/
    public Profesor() {
        System.out.println("Profesor inicializando constructor...");
    }

    //Implementación de método constructor con varios parámetros/argumentos
    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }
    public Profesor(String nombre, String apellido, String materia){
        this(nombre, apellido);
        this.materia = materia;
    }

    //Implementación de métodos getter & setter
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }

    //Implementamos sobreescritura de método saludar(); heredado
    @Override
    public String saludar(){
        return "Buen día, mi nombre es " + getNombre()
                + " y soy profesor de la materia " + getMateria();
    }

    //Implementación del método ToString
    @Override
    public String toString(){
        return super.toString() +
                "\nmateria: " + materia;
    }
}
