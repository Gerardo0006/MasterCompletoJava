import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[10];

        //Llenamos el array
        for (int i = 0; i<array1.length; i++){
            System.out.print("Ingrese valor para array1[" + i + "] -> ");
            array1[i] = scanner.nextInt();
        }

        //Solicitamos que se ingrece el índice del valor que desea eliminar
        System.out.print("Ingresa el índice del valor que desea eliminar:");
        int pos = scanner.nextInt();

        //Desplazamos los valores del array
        for (int i = pos; i<array1.length-1; i++){
            array1[i] = array1[i+1];
        }

        //Imprimimos cómo quedaría el array con el valor(índice eliminado
        for (int i = 0; i< array1.length; i++){
            System.out.println("array1[" + i + "] -> " + array1[i]);
        }

        //Duplicamos el array1 en uno nuevo
        int[] array2 = new int[array1.length-1];
        System.arraycopy(array1, 0, array2, 0, array2.length);

        System.out.println("El arreglo ordenado es el siguiente");
        for (int i = 0; i< array2.length; i++){
            System.out.println("array2[" + i + "] -> " + array2[i]);
        }
    }
}
