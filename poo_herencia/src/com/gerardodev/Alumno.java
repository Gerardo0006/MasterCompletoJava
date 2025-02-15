package com.gerardodev;

public class Alumno extends Persona {
    //Declaración de atributos propios de ésta clase
    private String escuela;
    private double califMatematicas;
    private double califEspaniol;
    private double califHistoria;

    //Implementación de método constructor (sin parámetros)
    /*Siempre que mandamos llamar al método constructor de una clase hija que hereda de una
     * clase padre, se manda a llamar primero al método constructor de la clase padre, luego
     * el de la clase hija.*/
    public Alumno() {
        System.out.println("Alumno inicializando constructor...");
    }

    //Implementación de métodos constructores con distintos parámetros/argumentos
    public Alumno(String nombre, String apellido){
        super(nombre, apellido); //Con super hacemos referencia al método constructor de la clase padre Persona
    }
    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad); //Llamamos de forma explícita con super(); al constructor de la clase padre Persona
    }
    public Alumno(String nombre, String apellido, int edad, String escuela){
        this(nombre, apellido, edad); //Hacemos referencia al método constructor anterior
        this.escuela = escuela;
    }

    //Implementación de método constructor que inicializa todos los atributos
    public Alumno(String nombre, String apellido, int edad, String escuela,
                  double califEspaniol, double califHistoria, double califMatematicas){
        this(nombre, apellido, edad, escuela);
        this.califEspaniol = califEspaniol;
        this.califHistoria = califHistoria;
        this.califMatematicas = califMatematicas;
    }


    //Implementación de métodos getter & setter
    public String getEscuela() {
        return escuela;
    }
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    public double getCalifMatematicas() {
        return califMatematicas;
    }
    public void setCalifMatematicas(double califMatematicas) {
        this.califMatematicas = califMatematicas;
    }
    public double getCalifEspaniol() {
        return califEspaniol;
    }
    public void setCalifEspaniol(double califEspaniol) {
        this.califEspaniol = califEspaniol;
    }
    public double getCalifHistoria() {
        return califHistoria;
    }
    public void setCalifHistoria(double califHistoria) {
        this.califHistoria = califHistoria;
    }

    //Implementaión de Método para calcular promedio (se va a heredar a AlumnoInternacional)
    public double calcularPromedio(){
        //System.out.println("calcular promedio: " + Alumno.class.getCanonicalName());
        return (getCalifEspaniol() + getCalifHistoria() + getCalifMatematicas())/3;
    }

    //Implementación de sobreescritura de método saludar(); heredado de Persona
    @Override
    public String saludar(){
        String saludar = super.saludar(); //Asignamos el valor del método saludar(); de la clase padre
        // Persona a la variable saludar
        return saludar + " soy alumno y mi nombre es " + getNombre();
    }

    //Implementación de sobreescritura de método toString();
    @Override
    public String toString() {
        return super.toString() +
                "\ninstitución: " + escuela +
                "\ncalifEspañol: " + califEspaniol +
                "\ncalifHistoria: " + califHistoria +
                "\ncalifMatemáticas: " + califMatematicas +
                "\ncalcularPromedio(); -> " + this.calcularPromedio();
    }
}
