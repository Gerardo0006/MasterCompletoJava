import java.util.Random;

public class NumeroMasAlto {
    public static void main(String[] args) {
        int[] array = new int[7];
        Random randomNumber = new Random();

        //Llenamos el array con números aleatorios
        for (int i=0; i<7; i++){
            array[i] = 11 + randomNumber.nextInt(99-11+1);
        }

        //Mostramos el array
        for (int i=0; i<7; i++){
            System.out.println("array[" + i + "] -> " + array[i]);
        }

        //Calculamos el mayor dentro del arreglo
        int higher = 0, index = 0;
        for (int i = 0; i<7; i++){
            if (array[i] > higher){
                higher = array[i];
                index = i;
            }
        }
        System.out.print("\nEl elemento más grande del arreglo es: [" + higher + "]\n");
        System.out.print("Y fue encontrado en el indice = " + index);
    }
}
