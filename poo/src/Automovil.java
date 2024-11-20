//Las clases tienen 2 modificadores de acceso (public y default (para usar
// default no se escribe nada antes del nombre de la clase)).
public class Automovil {

    //Declaramos los atributos
    //Una buena práctica es que los atributos siempre deben ser
    // privados para acceder a ellos solamente desde la clase
    // donde se definen los métodos. A continuación pongo privados todos los atributos con private.
    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindrada;
    //Agregamos nuevo atributo/característica
    private int capacidadTanque = 40;

    //Implementamos un Método vacío
    public Automovil(){
    }

    //Implementamos el Método Constructor
    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    //Implementamos Método constructor con tres parámetros
    public Automovil(String fabricante, String modelo, String color) {
        //Vamos a optimzar el código haciéndo uso de this. Vamos a llamar al constructor anterior.
        /*this.fabricante = fabricante;
        this.modelo = modelo;*/
        this(fabricante, modelo);
        this.color = color;
    }

    //Implementamos Método constructor con cuatro parámetros
    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        /*this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;*/
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    //Implementamos Método constructor con cinco parámetros
    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
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
    public String getColor(){
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
    public void setColor(String color){
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

    public String verDetalle(){
        //StringBuilder sb = new StringBuilder(); //Optimización de Código, aquí no usamos la variable sb y por ende podemos omitirla
        return ("auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo  +
                "\nauto.color = " + this.color +
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

    //Agregamos la sobreescritura de un método
    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj;
        return (this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }
}
