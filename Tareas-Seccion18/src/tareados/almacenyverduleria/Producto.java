package tareados.almacenyverduleria;

public class Producto {
    //Declaramos los atributos
    private String nombre;
    private double precio;

    //Declaramos/definimos método constructor
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //Declaramos/definimos los métodos getter
    public String getNombre() {
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }

    //Implementación de sobreescritura de Método toString();
    @Override
    public String toString(){
        return "Nombre: " + nombre +
                "\nPrecio: " + precio;
    }
}
