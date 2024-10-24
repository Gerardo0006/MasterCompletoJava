import java.util.Scanner;

public class EjemploArregloReemplazarPosicion3b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int numero, posicion, ultimo;

        //Llenamos el array
        for (int i = 0; i<array.length-1; i++){
            System.out.print("Ingrese valor para " + i + ": ");
            array[i] = scanner.nextInt();
        }

        //Solicitamos el valor que desea agregar
        System.out.print("Ingresa el número que deseas agregar al arreglo:");
        numero = scanner.nextInt();

        ultimo = array[array.length-1];
        posicion = 0;
        while (posicion<9 && numero>array[posicion]){
            posicion++;
        }

        //Movemos cada valor al siguiente índice
        for (int i = array.length-2; i>=posicion; i--){
            array[i+1] = array[i];
        }

        int[] array2 = new int[array.length+1];
        System.arraycopy(array, 0, array2, 0, array.length);

        if (numero > ultimo){
            array2[array2.length-1] = numero;
        } else {
            array2[array.length-1] = ultimo;
            array2[posicion] = numero;
        }

        //Imprimimos el array
        System.out.println("El arreglo ordenado es: ");
        for (int i = 0; i<array2.length; i++){
            System.out.println("array[" + i + "] -> " + array2[i]);
        }
    }
}
