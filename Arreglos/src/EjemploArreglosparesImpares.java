import java.util.Scanner;

public class EjemploArreglosparesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declaramos los arrays
        int[] array, arrayPares, arrayImpares;
        //Definimos array 'array'
        array = new int[10];

        //Llenamos el array "array"
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }

        //Contamos el total de números pares e impares para calcular el tamaño de su respectivo array
        int contPares = 0, contImpares = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i]%2 == 0){
                contPares++;
            } else {
                contImpares++;
            }
        }

        //Definimos el array de pares y el array de impares
        arrayPares = new int[contPares];
        arrayImpares = new int[contImpares];

        //Asignamos valores a cada array según corresponda (pares o impares)
        int j = 0; //variable de control del array de pares
        int k = 0; //variable de control del array de impares

        for (int i = 0; i<array.length; i++){
            if (array[i]%2 == 0){
                arrayPares[j++] = array[i];
            } else {
                arrayImpares[k++] = array[i];
            }
        }

        //Imprimimos ambos arrays con sus respectivos valores
        System.out.println("=== Array de pares ===");
        for (int i=0; i<arrayPares.length; i++){
            System.out.println("arrayPares[" + i + "] -> " + arrayPares[i]);
        }
        System.out.println();
        System.out.println("=== Array de impares ===");
        for (int i=0; i<arrayImpares.length; i++){
            System.out.println("arrayImpares[" + i + "] -> " + arrayImpares[i]);
        }
    }
}
