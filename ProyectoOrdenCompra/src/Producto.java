public class Producto {
    //Declaramos los atributos
    String fabricante;
    String nombre;
    int precio;

    //Implementamos método constructor
    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Implementamos métodos getter
    public String getFabricante() {
        return fabricante;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
}
