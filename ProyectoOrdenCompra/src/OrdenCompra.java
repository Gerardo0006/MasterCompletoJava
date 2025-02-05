import java.lang.reflect.Array;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class OrdenCompra {

    //Delaramos atributo estático que llevará el conteo de los objetos creados
    private static int contador = 1;
    //Declaramos los atributos privados
    private Integer identificador;
    private String descripcion;
    private /*Date*/String fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4]; //Arreglo de productos con tamaño 4
    private int indiceProducto = 0; //Para saber en qué índice agregar el próximo producto

    //Implementamos método constructor
    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = contador++;
    }

    //Implementamos métodos getter para todos los atributos
    public int getIdentificador() {
        return identificador;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String/*Date*/ getFecha() {
        return fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Producto[] getProductos() {
        return productos;
    }

    //Implementamos métodos setter
    public void setFecha(String/*Date*/ fecha) {
        this.fecha = fecha;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Implementamos método para agregar productos
    public void addProducto(Producto producto){
        if (indiceProducto < productos.length){
            productos[indiceProducto++] = producto;
        } else {
            System.out.println("No se pueden agregar más productos a la orden.");
        }
    }

    //Implementando método para calcular el gran total de la orden de compra
    public int calcularGranTotal(){
        int total = 0;
        for (Producto producto : productos){
            if (producto != null){
                total += producto.getPrecio();
            }
        }
        return total;
    }
}
