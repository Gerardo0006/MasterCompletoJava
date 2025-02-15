package com.gerardodev;

public class AlumnoInternacional extends Alumno {
    //Definimos los atributos propios de ésta clase
    private String pais;
    private double califIdiomas;

    //Implementación de método constructor (sin parámetros)
    /*Siempre que mandamos llamar al método constructor de una clase hija que hereda de una
     * clase padre, se manda a llamar primero al método constructor de la clase padre, luego
     * el de la clase hija.*/
    public AlumnoInternacional() {
        System.out.println("AlumnoInternacional inicializando constructor...");
    }

    //Implementación de métodos constructores con varios parámetros/atributos
    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }
    public AlumnoInternacional(String nombre, String apellido, String pais){
        this(nombre, apellido);
        this.pais = pais;
    }

    //Implementamos métodos getter & setter
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public double getCalifIdiomas() {
        return califIdiomas;
    }
    public void setCalifIdiomas(double califIdiomas) {
        this.califIdiomas = califIdiomas;
    }

    //Implementamos sobreescritura de método saludar(); heredado
    @Override
    public String saludar() {
        return super.saludar() +  ", soy un alumno internacional y mi país es " + getPais(); //Hereda el método saludar(); de la
        // clase padre, ya que estamos usando 'super', la clase padre en éste caso es Alumno
    }

    //Implementamos sobreescritura de método calcularPromedio(); heredado de Alumno
    @Override
    public double calcularPromedio(){
        //System.out.println("calcular promedio: " + AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularPromedio()*3) + califIdiomas)/4;
    }

    //Implementación de sobreescritura de método toString();
    @Override
    public String toString() {
        return super.toString() +
                "\ncalifIdiomnas: " + califIdiomas +
                "\npais: " + pais/* +
                "\ncalcularPromedio(); -> " + this.calcularPromedio()*/;
    }
}
