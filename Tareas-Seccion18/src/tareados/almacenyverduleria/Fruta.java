package tareados.almacenyverduleria;

public class Fruta extends Producto{
    //Declaramos los atributos
    private double peso;
    private String color;

    //Declaramos/definimos el método constructor
    public Fruta(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    //Declaramos/definimos los métodos getter
    public double getPeso() {
        return peso;
    }
    public String getColor() {
        return color;
    }

    //Implementación de Método toString();
    @Override
    public String toString() {
        return super.toString() +
                "\nPeso: " + peso +
                "\nColor: '" + color;
    }
}
