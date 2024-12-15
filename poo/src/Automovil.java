//Las clases tienen 2 modificadores de acceso (public y default (para usar
// default no se escribe nada antes del nombre de la clase)).
public class Automovil {

    //Declaramos los atributos
    //Una buena práctica es que los atributos siempre deben ser
    // privados para acceder a ellos solamente desde la clase
    // donde se definen los métodos. A continuación pongo privados todos los atributos con private.
    private String fabricante;
    private String modelo;
    //private String color = "gris";
    //Cambiamos el tipo de dato de color que es String, por el tipo enum que es Color
    private Color color = Color.GRIS;
    private double cilindrada;
    //Agregamos nuevo atributo/característica
    private int capacidadTanque = 40;
    //Agregamos ID para cada instancia/objeto
    private int id;

    //Agregamos atributo estático
//    private static String colorPatente = "Naranja";
    //Cambiamos el tipo de dato de color que es String, por el tipo enum que es Color
    private static Color colorPatente = Color.NARANJA;
    private static int capacidadEstanqueEstatico = 30;
    //Agregamos atributo estático ID para cada instancia/objeto
    private static int ultimoId;

    //Agregamos un valor constante, el cuál identificamos con la palabra reservada 'final'
    //Las constantes se declaran con mayúsculas y palabras compuestas separadas con guión bajo
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAXIMA_CIUDAD = 60;

    //Agregamos nueva constatnte
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris";

    //Implementamos un Método vacío
    public Automovil(){
        /*Cada que se crea el objeto en éste método constructor
          incrementamos ultimoId que es estático y se lo asignamos
          al atributo id de la instancia.*/
        this.id = ++ultimoId;
    }

    //Implementamos el Método Constructor
    public Automovil(String fabricante, String modelo){
        //Invocamos al constructor sin parámetros para que se asigne el id
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    //Implementamos Método constructor con tres parámetros
    public Automovil(String fabricante, String modelo, /*Cambiamos el tipo string por tipo enum (Color). String*/Color color) {
        //Vamos a optimzar el código haciéndo uso de this. Vamos a llamar al constructor anterior.
        /*this.fabricante = fabricante;
        this.modelo = modelo;*/
        this(fabricante, modelo);
        this.color = color;
    }

    //Implementamos Método constructor con cuatro parámetros
    public Automovil(String fabricante, String modelo, /*Cambiamos el tipo string por tipo enum (Color). String*/Color color, double cilindrada) {
        /*this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;*/
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    //Implementamos Método constructor con cinco parámetros
    public Automovil(String fabricante, String modelo, /*Cambiamos el tipo string por tipo enum (Color). String*/Color color, double cilindrada, int capacidadTanque) {
        /*this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;*/
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    /*Si no tenemos definidos los métodos SET y GET podemos agregarlos con
    * click derecho, generate y selleccionando la opción getter y setter.*/

    //Agregamos un nuevo Método GET para cada atributo
    //Cambiamos el nombre de los métodos leer por get
    public String getFabricante(){
        return this.fabricante;
    }
    public String getModelo(){
        return this.modelo;
    }
    public /*Cambiamos el tipo string por tipo enum (Color). String*/Color getColor(){
        return this.color;
    }
    public double getCilindrada(){
        return cilindrada;
    }
    public int getCapacidadTanque(){
        return capacidadTanque;
    }

    //Agregamos un nuevo Método SET para cada atributo
    //Este tipo de métodos no retornan nada (son tipo VOID).
    //Cambiamos el nombre de los métodos asignar por set
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(/*Cambiamos el tipo string por tipo enum (Color). String*/Color color){
        this.color = color;
    }
    public void asignarCapacidadTanque(int capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }
    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    /*
    //Agregamos Métodos
    public void detalle(){
        //Es buena práctica y más recomendado usar this
        //Es mala practica imprimir dentro del método con sout
        String modelo = "Otro modelo";
        System.out.println("auto.fabricante = " + fabricante); //Aquí aunque quitemos el
        // this, hace referencia al atributo porque dentro del método no hay otra variable
        // con el mismo nombre del método
        System.out.println("modelo = " + modelo); //Se puede omitir la palabra this,
        // pero en este caso está haciendo referencia al String modelo y no al atributo.
        System.out.println("auto.modelo = " + this.modelo);
        System.out.println("auto.color = " + this.color);
        System.out.println("auto.cilindrada = " + this.cilindrada);
    }*/


    public static /*Cambiamos el tipo string por tipo enum (Color). String*/Color getColorPatente(){
        return colorPatente;
    }
    public static void setColorPatente(/*Cambiamos el tipo string por tipo enum (Color). String*/Color colorPatente){
        Automovil.colorPatente = colorPatente; //Lo diferenciamos con la clase Automovil.
    }

    //Agregamos métodos getter & setter para capacidadEstanqueEstatico
    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }
    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    //Agregamos métodos getter & setter para id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String verDetalle(){
        //StringBuilder sb = new StringBuilder(); //Optimización de Código, aquí no usamos la variable sb y por ende podemos omitirla
        return ("auto.id = " + this.id +
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo  +
                "\nauto.color = " + this.color +
                "\nauto.patenteColor = " + /*Automovil.colorPatente*/ colorPatente + //Invocamos al valor del atributo sólo con el nombre del atributo, sin this o con el nombre de la clase seguido de "." y el nombre del atributo.
                "\nauto.cilindrada = " + this.cilindrada);
        //return sb.toString(); //Optimización de Código, aquí no usamos la variable sb y por ende podemos omitirla
    }

    //Otro método (acelerar)
    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " está acelerando a " + rpm + "rpm";
    }

    //Otro método (frenar)
    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    //Otro método (acelerar y frenar)
    public String acelerarFrenar(int rpm){
        String acelerar = acelerar(rpm);
        String frenar = frenar();
        return acelerar + "\n" + frenar;
    }

    //Nuevo método
    public float calcularConsumo(int km, float porcentajeGasolina){
        return km/(capacidadTanque*porcentajeGasolina);
    }
    //La sobre carga de métodos es crear dos métodos con el mismo nombre pero distintos parámetros/argumentos
    public float calcularConsumo(int km, int porcentajeGasolina){
        return km/(capacidadTanque*(porcentajeGasolina/100f));
    }

    //Implementamos método calcular consumo con atributo capacidadEstanqueEstático
    public static float calcularConsumoEstatico(int km, int porcentajeGasolina){
        return km/(capacidadEstanqueEstatico*(porcentajeGasolina/100f));
    }

    //Agregamos la sobreescritura de un método
    @Override
    public boolean equals(Object obj) {
        //Agregué validación para verificar que se trata del mismo objeto ya que se compara por referencia
        if (this == obj){
            return true;
        }

        //Agregué validación para que sólo se pueda comparar con objetos de la misma clase
        if (!(obj instanceof Automovil)){
            return false;
        }

        Automovil a = (Automovil) obj;
        //Agregué validación para que no acepté o no se compare con objetos vacíos
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    //Sobreescritura del Método toString
    @Override
    public String toString() {
        return /*"Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadTanque=" + capacidadTanque +
                '}'; */
        this.id + " : " + fabricante + " " + modelo;
    }
}
