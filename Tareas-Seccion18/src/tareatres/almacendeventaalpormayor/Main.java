package tareatres.almacendeventaalpormayor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Creando instancias de Producto
        Producto milk = new AlimentoPerecedero("Leche LALA", 22, LocalDate.of(2025, 3, 10));
        Producto rice = new AlimentoNoPerecedero("Arroz Verde Valle", 15, 500);
        Producto cloro = new Limpieza("Lysol aerosol", 90, "SC Jhonson", "Desinfectante");

        //Creando instancias de Vendedor
        Vendedor seller1 = new Vendedor("Gustavo", 01);
        Vendedor seller2 = new Vendedor("Emanuel", 02);

        //Creando instancias de Cliente
        Cliente customer1 = new Cliente("Francisco", 01);
        Cliente customer2 = new Cliente("Rolando", 02);

        //Los clientes compran prods
        customer1.buyProduct(seller1, milk);
        System.out.println("-------------");
        customer2.buyProduct(seller2, rice);
        System.out.println("=============");
        customer1.buyProduct(seller2, cloro);
        System.out.println("-------------");
        customer2.buyProduct(seller1, cloro);
        System.out.println("=============");
        System.out.println("milk = " + milk);
    }
}
