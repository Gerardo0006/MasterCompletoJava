import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Ingresa 10 números enteros:");
        //Llenamos el array
        for (int i=0; i< array.length; i++){
            array[i] = scanner.nextInt();
        }

        //Determinamos el orden del array
        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i< array.length-1; i++){
            if (array[i] > array[i+1]){
                descendente = true;
            }
            if (array[i] < array[i+1]){
                ascendente = true;
            }
        }
        if (descendente == true && ascendente == true){
            System.out.println("El arreglo está desordenado");
        }
        if (descendente == false && ascendente == false){
            System.out.println("Todos los elementos del array son iguales");
        }
        if (descendente == true && ascendente == false){
            System.out.println("El arreglo está ordenado de forma descendente");
        }
        if (descendente == false && ascendente == true){
            System.out.println("El arreglo está ordenado de forma ascendente");
        }
    }
}
