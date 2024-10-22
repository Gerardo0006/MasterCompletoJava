import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {
        //String[] productos = new String[3];
        //String prods[] = new String[3]; //Esta es otra manera de definir un array
        //Definiendo e inicializando array (sólo aplica cuando conocemos la cantidad de elementos que contendrá el array y su valor)
        String[] productos = {"Kingston pendrive 64GB", "Samsung Galaxy S24 Ultra", "AirPods Pro 3ra Gen"};
        int longArray = productos.length;

        /*productos[0] = "Kingston pendrive 64GB";
        productos[1] = "Samsung Galaxy S24 Ultra";
        productos[2] = "AirPods Pro 3ra Gen";
        */
        //Clase Arrays con métodos (método sort) para ordenar alfabeticamente arrays
        //Siempre que vayamos a ordenar un array con el método sort, hay que hacerlo antes de imprimirlo con un for

        Arrays.sort(productos);
        System.out.println("=== Usando for ===");
        for (int i = 0; i<longArray; i++){
            System.out.println("Para índice i -> " + i + ": " + productos[i]);
        }

        System.out.println("=== Usando for inverso ===");
        for (int i = 0; i < longArray; i++) {
            System.out.println("productos[" + i + "] = " + productos[longArray-1-i]);
        }

        System.out.println("=== Usando for Decreciente ===");
        for (int i=longArray-1; i>=0; i--){
            System.out.println("productos[" + i + "] = " + productos[i]);
        }
    }
}
