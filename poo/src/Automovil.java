public class Automovil implements Comparable<Automovil> {//Entre <> colocamos el tipo que queremos comparar

    //Definimos atributos de la clase
    //Los atributos de la clase pueden ser usados en una instancia de la clase (Objetos).
    //Los atributos pueden ser públicos o privados (por defecto son públicos)(para hacerlos privados hay que usar private en su declaración).
    private String fabricante;
    private String modelo;
    //private String color;
    //Cambiamos el tipo de dato de color, ya que ahora los valores de este atributo están en un enum
    private Color color; //Es opcional darle valor por defecto (inicializarlo con un valor)
    private Motor motor; //private double cilindrada; //En lugar de cilindrada usaremos una variable del enum tipo Motor llamada motor
    private Tanque tanque; //private int capacidadTanque = 40; //En lugar de capacidadTanque usaremos una variable del enum tipo Tanque llamada tanque
    private Persona conductor;
    private Rueda[] ruedas;
    //Definimos/declaramos atributo static
    private static String colorPatente = "Naranja";
    //Creamos un atributo privado para cada objeto/instancia (id)
    private int id;
    private static int ultimoId;

    /*Ahora vamos a implementar el tipo de categoría TipoAutomovil, que es un enum. Para ello creamos un atributo*/
    private TipoAutomovil tipo;


    //Creamos la constante (final)
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 60;

    //Cramos constantes para el color de los autos
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_NEGRO = "Negro";
    public static final String COLOR_GRIS_MAZDA = "Gris Polimetal";
    public static final String COLOR_GRIS_HONDA = "Gris Meteoro";


    //Creando Método constructor
    public Automovil(String fabricante, String modelo){
        this(); //Aquí invocamos el método constructor sin parámetros
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    //Creando Método constructor vacío
    public Automovil(){
        //Vamos a usar éste constructor vacío para asignar los id a los demás objetos
        this.id = ++ultimoId;
    }
    //Creando Método constructor con 4 parámetros
    public Automovil(String fabricante, String modelo, /*Cambiamos tipo de dato String por Color*/ /*String*/ Color color, /*En lugar de cilindrada usaremos la variable de tipo Motor llamada motor*//*double cilindrada*/ Motor motor) {
        //Optimizaión de código
        /*this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;*/
        this(fabricante, modelo); //Esta línea invoca al método que tiene los mismos parámetros
        this.color = color;
        this.motor/*cilindrada*/ = motor/*cilindrada*/; //En lugar de cilindrada usaremos la variable de tipo Motor llamada motor
    }

    //Creamos un método constructor con todos los atributos (sobrecarga de constructor)
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
        this.conductor = conductor;
        this.ruedas = ruedas;
    }



    /*
    //Definiendo los métodos leer/Get para los atributos private de la class Automovil
    public String leerFabricante(){
        return this.fabricante;
    }
    public String leerModelo(){
        return this.modelo;
    }
    public String leerColor(){
        return this.color;
    }
    public double leerCilindrada(){
        return this.cilindrada;
    }
    public int leerCapacidadTanque(){
        return this.capacidadTanque;
    }*/

    /*
    //Definiendo los métodos modificar/Set para los atributos private de la class Automovil
    public void asignarFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public void asignarModelo(String modelo){
        this.modelo = modelo;
    }
    public void asignarColor(String color){
        this.color = color;
    }
    public void asignarCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }
    public void asignarCapacidadTanque(int capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }*/

    //Creamos los métodos getter & setter con click derecho
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public /*Cambiamos tipo de dato String por Color*/ /*String*/ Color getColor() {
        return color;
    }

    public void setColor(/*Cambiamos tipo de dato String por Color*/ /*String*/ Color color) {
        this.color = color;
    }

    //Comentaremos los métodos getter & setter para cilindrada, ya que usaremos otros atributos
    // con sus métodos getter & setter
    /*public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }*/

    //Implementamos métodos getter & setter para nuevos atributos
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        return tanque;
    }
    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public Persona getConductor() {
        return conductor;
    }
    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }
    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    //Creamos métodos estáticos getter & setter
    public static String getColorPatente(){
        return colorPatente;
    }
    public static void setColorPatente(String colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    //Creamos métodos getter & setter para atributo tipo, que pertenece a enum TipoAutomovil
    public TipoAutomovil getTipo() {
        return tipo;
    }
    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    /*
            //Definimos los métodos de la clase
            public void detalle(){
                System.out.println("fabricante = " + this.fabricante);
                System.out.println("modelo = " + this.modelo);
                System.out.println("color = " + this.color);
                System.out.println("cilindrada = " + this.cilindrada);
            }*/
    /*public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("fabricante = " + this.fabricante);
        sb.append("\nmodelo = " + this.modelo);
        sb.append("\ncolor = " + this.color);
        sb.append("\ncilindrada = " + this.cilindrada);

        return sb.toString();
    }*/
    /*public String detalle(){
        String sb = "fabricante = " + this.fabricante +
                "\nmodelo = " + this.modelo +
                "\ncolor = " + this.color +
                "\ncilindrada = " + this.cilindrada;

        return sb;
    }*/
    public String verDetalle(){
        return "id = " + this.id +
                "\nfabricante = " + this.fabricante +
                "\nmodelo = " + this.modelo +
                "\ncolor = " + this.color/*.getColor() -> Se comenta el método ya que con la
                sobrescritura de toString en el enum es suficiente para retornar el color.*/ +
                "\ncilindrada = " + this.motor.getCilindrada()/*cilindrada*//*En lugar de cilindrada usaremos la variable de tipo Motor llamada motor*/ +
                "\nTipo de automovil = " + this.getTipo().getNombre()/*Concatenamos el método getNombre
                  para que se imprima el tipo de automóvil con el formato que definimos en el enum*/ +
                "\nNúmero de puertas = " + this.getTipo().getNumeroPuertas() +
                "\ncolorPatente = " + Automovil.colorPatente +
                "\nConductor = " + this.getConductor(); //A este atributo accedemos
        // con this ya que es un atributo estático propio de la clase. También podríamos
        // acceder a él solamente con el nombre del atributo.
    }

    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " " + this.modelo + " acelerando a " + rpm + " rpm.";
    }

    public String frenar(){
        return "El auto " + this.fabricante + " " + this.modelo + " está frenando.";
    }

    public  String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina){
        return km/(tanque.getCapacidad()/*capacidadTanque*/*porcentajeGasolina);//En lugar de capacidadEstanque usaremos el objeto llamado tanque con su metodo getCapacidad
    }
    public float calcularConsumo(int kmRecorridos, int porcentajeGastadoTanque){
        return kmRecorridos/(tanque.getCapacidad()/*capacidadTanque*/*(porcentajeGastadoTanque/100f));//En lugar de capacidadEstanque usaremos el objeto llamado tanque con su metodo getCapacidad
    }

    //Implementamos sobreescritura de métodos
    @Override
    public boolean equals(Object obj) {
        //Agregamos validación para comparar por referencia y saber si se trata del mismo tipo
        if(this == obj){
            return true;
        }
        //Agregamos validación para comparar solamente cuando sean instancias del mismo tipo/clase
        if(!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj; //Hacemos cast a obj para comparar objetos del mismo tipo
        return (this.fabricante != null &&
                this.modelo != null &&
                this.fabricante.equals(a.getFabricante()) &&
                this.modelo.equals(a.getModelo()));
    }

    //Implementamos la sobreescritura del método toString
    /*@Override
    public String toString() {
        return "\nAutomovil{" +
                "\nid = " + this.id +
                "\nfabricante = " + fabricante +
                "\nModelo = " + modelo +
                "\nColor = " + color +
                "\n}";
    }*/
    @Override
    public String toString() {
        return this.id + ": " + fabricante + " " + modelo;
    }

    //Implementamos el método compareTo
    @Override
    public int compareTo(Automovil a) {
        // /*Podemos evitar hacer cast si ponemos el tipo de dato <>*/Automovil a = (Automovil)  o; //Hacemos cast a 'o' que recibimos por parámetro
        return this.fabricante.compareTo(a.fabricante);
    }
}
