import java.util.Scanner;

public class EjemploArregloReemplazarPosicion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int elemento, posicion;

        //Llenamos el array
        for (int i = 0; i<array.length-1; i++){
            System.out.print("Ingrese valor para " + i + ": ");
            array[i] = scanner.nextInt();
        }

        //Solicitamos el valor que desea agregar y el índice en el que se insertará
        System.out.print("Ingresa el número que deseas agregar al arreglo:");
        elemento = scanner.nextInt();
        System.out.print("Ingresa el índice en que deseas agregar el número (0-9):");
        posicion = scanner.nextInt();

        //Movemos cada valor al siguiente índice
        for (int i = array.length-2; i>=0; i--){
            array[i+1] = array[i];
        }
        array[posicion] = elemento;

        //Imprimimos el array
        for (int i = 0; i<array.length; i++){
            System.out.println("array[" + i + "] -> " + array[i]);
        }
    }
}
