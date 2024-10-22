import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {
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

    public static void sortBurbuja(Object[] array){
        int total = array.length;
        int cont = 0;

        for (int i = 0; i<total-1; i++){
            for (int j=0; j<total-1-i; j++){
                if (((Comparable) array[j+1]).compareTo(array[j]) < 0){
                    Object auxiliar = array[j];
                    array[j] = array[j+1];
                    array[j+1] = auxiliar;
                }
                cont++;
            }
        }
        System.out.println("cont = " + cont);
    }

    public static void main(String[] args) {
        String[] productos = {"Kingston pendrive 64GB", "Samsung Galaxy S24 Ultra", "AirPods Pro 3ra Gen"};
        int longArray = productos.length;
        int cont = 0;
        //Algoritmo de Ordenamiento Burbuja
//        for (int i=0; i<longArray; i++){
//            for (int j=0; j<longArray; j++){
//                if (productos[i].compareTo(productos[j]) < 0){
//                    String aux = productos[i];
//                    productos[i] = productos[j];
//                    productos[j] = aux;
//                }
//                cont++;
//
//            }
//        }

        //Algoritmo de Ordenamiento Burbuja Optimizado
        for (int i=0; i<longArray-1; i++){
            for (int j=0; j<longArray-1; j++){
                if (productos[j+1].compareTo(productos[j]) < 0){
                    String aux = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = aux;
                }
                cont++;

            }
        }

        //Arrays.sort(productos);
        //invertirArreglo(productos);
        //Collections.reverse(Arrays.asList(productos));
        for (int i=0; i<longArray; i++){
            System.out.println("productos[" + i + "] = " + productos[i]);
        }
        System.out.println("cont = " + cont);

        System.out.println("-----------------------------------");
        //Trabajando con array tipo Int
        Integer[] array = new Integer[5];

        array[0] = 5;
        array[1] = 4;
        array[2] = Integer.valueOf("3"); //Ejemplo de AutoUnboxing
        array[3] = (int)2L; //Ejemplo de Cast
        array[4] = 1;

        //llamamos al método
        sortBurbuja(array);
        for (int i = 0; i<5; i++){
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
