import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    //Implementamos Método para mutar un array e imprimirlo
    public static void invertirArreglo(String[] productos){
        int total1 = productos.length;
        int total2 = productos.length;

        for (int i = 0; i<total2; i++){
            String actual = productos[i];
            String inverso = productos[total1-1-i];
            productos[i] = inverso;
            productos[total1-1-i] = actual;
            total2--; //Decrementamos total2 para que solamente se ejecute hasta la mitad del arreglo
        }
    }

    public static void main(String[] args) {
        String[] productos = {"Kingston pendrive 64GB", "Samsung Galaxy S24 Ultra", "AirPods Pro 3ra Gen"};
        int longArray = productos.length;

        Arrays.sort(productos);
        System.out.println("=== Usando for ===");
        for (int i = 0; i<longArray; i++) {
            System.out.println("Para índice i -> " + i + ": " + productos[i]);
        }

        System.out.println("\n=== Usando Método invertirArreglo() ===");
        //Arrays.sort(productos); //Ésta clase y método ordenan de manera creciente un array
        invertirArreglo(productos);
        //Imprimimos el arreglo ordenado decrecientemente
        for (int i=0; i<longArray; i++){
            System.out.println("productos[" + i + "] = " + productos[i]);
        }

        //Utilizando API de Colección de Java. Clase Collections.reverse() Ésta clase recibe como argumento una lista y lo reversa/invierte.
//        System.out.println("=== Usando Clase Collections ===");
//        Collections.reverse(Arrays.asList(productos)); //Arrays.asList(); recibe un array y lo convierte a lista
//        for (int i=0; i<longArray; i++){
//            System.out.println("productos[" + i + "] = " + productos[i]);
//        }
    }
}
