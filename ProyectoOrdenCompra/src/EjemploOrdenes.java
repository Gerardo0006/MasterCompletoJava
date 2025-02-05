import java.time.LocalDateTime;
import java.util.Date;
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class EjemploOrdenes {
    public static void main(String[] args) {

        //Creación de productos
        Producto producto1 = new Producto("Huawei", "P30 PRO", 8000);
        Producto producto2 = new Producto("Samsung", "Galaxy S22 Ultra", 25000);
        Producto producto3 = new Producto("Apple", "Iphone 16 PRO MAX", 25000);
        Producto producto4 = new Producto("Google", "Pixel 9 PRO", 25000);

        Producto producto5 = new Producto("Huawei", "Matebook D14", 15000);
        Producto producto6 = new Producto("Dell", "XPS 15", 22000);
        Producto producto7 = new Producto("Lenovo", "Yoga Slim 7i", 18000);
        Producto producto8 = new Producto("Apple", "Macbook Air M3", 22999);

        //Creación de clientes
        Cliente cliente1 = new Cliente("Gerardo", "Macías");
        Cliente cliente2 = new Cliente("Fátima", "Ramos");
        Cliente cliente3 = new Cliente("Karina", "Macías");

        //Creación de órdenes de compra
        OrdenCompra orden1 = new OrdenCompra("Orden 1 -> Celulares");
        orden1.setCliente(cliente1); //Asignamos el cliente a la órden de compra con método set
        LocalDateTime fecha = LocalDateTime.now(); //Obtenemos la fecha actual
        //Definimos el formato que tendrá la fecha
        DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaConFormato = fecha.format(fechaFormato); //Convertimos el objeto de tipo DateTime... a String
        orden1.setFecha(fechaConFormato); //Asignamos la fecha a la órden de compra con método set
        //Asignamos productos a la orden de compra
        orden1.addProducto(producto1);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);
        orden1.addProducto(producto4);

        OrdenCompra orden2 = new OrdenCompra("Orden de compra 2 -> Computadoras");
        orden2.setCliente(cliente2);
        orden2.setFecha(fechaConFormato/*new Date()*/);
        orden2.addProducto(producto5);
        orden2.addProducto(producto6);
        orden2.addProducto(producto7);
        orden2.addProducto(producto8);

        OrdenCompra orden3 = new OrdenCompra("Orden de compra 3 -> Electrónica");
        orden3.setCliente(cliente3);
        orden3.setFecha(fechaConFormato/*new Date()*/);
        orden3.addProducto(producto1);
        orden3.addProducto(producto8);
        orden3.addProducto(producto2);
        orden3.addProducto(producto7);

        //Mandamos llamar a la función/método que imprime las órdenes
        imprimirOrden(orden1);
        imprimirOrden(orden2);
        imprimirOrden(orden3);
    }

    //Función/Método que imprime la información de la órden
    public static void imprimirOrden(OrdenCompra orden) {
        System.out.println("id: " + orden.getIdentificador());
        System.out.println("Descripción: " + orden.getDescripcion());
        System.out.println("Cliente: " + orden.getCliente().toString());
        System.out.println("Fecha: " + orden.getFecha());
        System.out.println("Productos: ");

        //Imprimimos los productos con un foreach
        for (Producto producto : orden.getProductos()){
            //Validamos que producto no sea null
            if (producto != null){
                System.out.println("- " + producto.getNombre() +
                        " (" + producto.getFabricante() + ") " +
                        ", Precio: $" + producto.getPrecio());
            }
        }

        //Calculamos el total de la órden con el método calcularGranTotal
        System.out.println("Gran total: $" + orden.calcularGranTotal());
        System.out.println("---------------------------------------------------");
    }
}
