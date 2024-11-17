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

    //Agregamos un nuevo Método GET para cada atributo
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
        return cilindrada;
    }
    public int leerCapacidadTanque(){
        return capacidadTanque;
    }

    //Agregamos un nuevo Método SET para cada atributo
    //Este tipo de métodos no retornan nada (son tipo VOID).
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
}
