package com.gerardodev.appfacturas;

import com.gerardodev.appfacturas.modelo.*;

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
        //Comentando líneas para optimizar código. Los valores de nombre, precio y cantidad
        // no se asignan a variable, se pasan directamente por parámetro/argumento.
        /*String nombreProducto;
        float precioProducto;
        int cantidadProducto;*/

        System.out.println();

        //Implementamos bucle for para crear instancias/objetos de la clase Producto en cada iteración
        for(int i=0; i<2; i++){
            producto = new Producto(); //Inicializamos la instancia en cada iteración
            System.out.print("Ingrese nombre del producto n° " + producto.getCodigo() + ": ");
            producto.setNombre(scanner.next()); //Asignamos nombre al producto con el método setNombre

            System.out.print("Ingrese el precio del producto: ");
            producto.setPrecio(scanner.nextFloat());

            System.out.print("Ingrese la cantidad de producto: ");
            //cantidadProducto = scanner.nextInt();

            //Agregamos item a la factura con el método addItem, pasando por parámetro la nueva instancia
            factura.addItem(new ItemFactura(scanner.nextInt(), producto));

            System.out.println();
        }
        System.out.println(factura);
    }
}
