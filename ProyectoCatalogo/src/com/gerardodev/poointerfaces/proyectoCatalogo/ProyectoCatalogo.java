package com.gerardodev.poointerfaces.proyectoCatalogo;

import com.gerardodev.poointerfaces.proyectoCatalogo.clasesAbstractas.Producto;
import com.gerardodev.poointerfaces.proyectoCatalogo.clasesConcretas.Comics;
import com.gerardodev.poointerfaces.proyectoCatalogo.clasesConcretas.IPhone;
import com.gerardodev.poointerfaces.proyectoCatalogo.clasesConcretas.Libro;
import com.gerardodev.poointerfaces.proyectoCatalogo.clasesConcretas.TvLcd;
import com.gerardodev.poointerfaces.proyectoCatalogo.interfaces.IElectronico;
import com.gerardodev.poointerfaces.proyectoCatalogo.interfaces.ILibro;
import com.gerardodev.poointerfaces.proyectoCatalogo.interfaces.IProducto;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        //Implementando array de productos
        IProducto[] productos = new Producto[6];

        //Asignando valor a cada índice del array
        productos[0] = new IPhone(20000, "Apple", "Rose Gold", "Iphone 17 PRO MAX");
        productos[1] = new IPhone(18000, "Apple", "Black Carbon", "Iphone 15 PRO MAX");
        productos[2] = new TvLcd(28000, "Samsung", 80);
        productos[3] = new TvLcd(30000, "Sony", 65);
        productos[4] = new Libro(500, new Date(), "Gabriel García Márquez", "Cien años de soledad", "Sudamericana");
        productos[5] = new Comics(300, new Date(), "Stan Lee", "Spider-Man", "Marvel", "Spider-Man");

        //Mostrando los productos del catálogo con un Foreach
        for(IProducto producto : productos){
            System.out.println("Precio: " + producto.getPrecio() +
                    "\nPrecio venta: " + producto.getPrecioVenta() + "\n");
            if (producto instanceof IElectronico){
                IElectronico prodElectronico = (IElectronico) producto; //Parseando producto a IElectronico
                System.out.println("Fabricante: " + prodElectronico.getFabricante());
            }
            if (producto instanceof ILibro){
                ILibro prodLibro = (ILibro) producto; //Parseando producto a ILibro
                System.out.println("Titulo: " + prodLibro.getTitulo() +
                        "\nAuthor: " + prodLibro.getAutor() +
                        "\nEditorial: " + prodLibro.getEditorial());
            }
            System.out.println("------------------------------------");
        }
    }
}