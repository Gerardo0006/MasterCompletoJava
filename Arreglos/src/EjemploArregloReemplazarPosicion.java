import java.util.Scanner;

public class EjemploArregloReemplazarPosicion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        //Llenamos el array
        for (int i = 0; i<array.length; i++){
            System.out.print("Ingrese valor para " + i + ": ");
            array[i] = scanner.nextInt();
        }

        //Guardamos la última posición en una variable auxiliar para signarla despúes al índice 0
        int aux = array[array.length-1];

        //Movemos cada valor al siguiente índice
        for (int i = array.length-2; i>=0; i--){
            array[i+1] = array[i];
        }
        array[0] = aux;

        //Imprimimos el array
        for (int i = 0; i<array.length; i++){
            System.out.println("array[" + i + "] -> " + array[i]);
        }
    }
}
