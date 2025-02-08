package com.gerardodev.appfacturas;

import com.gerardodev.appfacturas.modelo.*/*Cliente*/;
/*import com.gerardodev.appfacturas.modelo.Factura;
import com.gerardodev.appfacturas.modelo.ItemFactura;
import com.gerardodev.appfacturas.modelo.Producto;*/

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Gerardo Macías");
        cliente.setRfc("MAMG0006HASC");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese descripción para la factura: ");
        String descripcion = scanner.nextLine();
        Factura factura = new Factura(descripcion, cliente);

        Producto producto; //Instancia/objeto de la clase Producto (sin inicializar)
        String nombreProducto;
        float precioProducto;
        int cantidadProducto;

        System.out.println();

        //Implementamos bucle for para crear instancias/objetos de la clase Producto en cada iteración
        for(int i=0; i<5; i++){
            producto = new Producto(); //Inicializamos la instancia en cada iteración
            System.out.print("Ingrese nombre del producto n° " + producto.getCodigo() + ": ");
            nombreProducto = scanner.next();
            producto.setNombre(nombreProducto); //Asignamos nombre al producto con el método setNombre

            System.out.print("Ingrese el precio del producto: ");
            precioProducto = scanner.nextFloat();
            producto.setPrecio(precioProducto);

            System.out.print("Ingrese la cantidad de producto: ");
            cantidadProducto = scanner.nextInt();

            ItemFactura item = new ItemFactura(cantidadProducto, producto); //Creamos instancia (objeto) pasando
            // por atributo valores a su método constructor
            factura.addItem(item); //Agregamos item a la factura con el método addItem

            System.out.println();
        }
        System.out.println(factura.generarDetalle());
    }
}
