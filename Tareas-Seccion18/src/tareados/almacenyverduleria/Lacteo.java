package tareados.almacenyverduleria;

public class Lacteo extends Producto {
    //Declaramos los atributos
    private int cantidad;
    private int proteinas;

    //Declaramos/definimos el método constructor
    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    //Declaramos/definimos los métodos getter
    public int getCantidad() {
        return cantidad;
    }
    public int getProteinas() {
        return proteinas;
    }

    //Implementación de Método toString();
    @Override
    public String toString(){
        return super.toString() +
                "\nCantidad: " + cantidad +
                "\nProteínas: " + proteinas;
    }
}
