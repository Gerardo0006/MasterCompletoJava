import java.util.Scanner;

public class EjemploArregloReemplazarPosicion2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int elemento, posicion, ultimo;

        //Llenamos el array
        for (int i = 0; i<array.length; i++){
            System.out.print("Ingrese valor para " + i + ": ");
            array[i] = scanner.nextInt();
        }

        //Solicitamos el valor que desea agregar y el índice en el que se insertará
        System.out.print("Ingresa el número que deseas agregar al arreglo:");
        elemento = scanner.nextInt();
        System.out.print("Ingresa el índice en que deseas agregar el número (0-9):");
        posicion = scanner.nextInt();

        //Movemos cada valor al siguiente índice
        ultimo = array[array.length-1];
        for (int i = array.length-2; i>=posicion; i--){
            array[i+1] = array[i];
        }
        int[] array2 = new int[array.length+1];
        System.arraycopy(array, 0, array2, 0, array.length);
        array2[posicion] = elemento;
        array2[array2.length-1] = ultimo;

        //Imprimimos el array
        for (int i = 0; i<array2.length; i++){
            System.out.println("array2[" + i + "] -> " + array2[i]);
        }
    }
}
