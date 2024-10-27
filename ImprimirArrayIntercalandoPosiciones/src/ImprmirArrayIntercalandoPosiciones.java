import java.util.Scanner;

public class ImprmirArrayIntercalandoPosiciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println("Ingresa un 10 números enteros para llenar el array:");

        //Llenamos el array
        for (int i = 0; i<10; i++){
            System.out.print("Ingresa valor para array[" + i + "] : ");
            array[i] = scanner.nextInt();
        }

        //Algoritmo para acomodar el arreglo con el orden solicitado (último-primero, penúltimo-segundo, etc)
        for (int i = 0; i < 5; i++){
            System.out.print("[" + array[array.length-1-i] + "]");
            System.out.print("[" + array[i] + "]");
        }
//        for (int i = 0; i < 5; i++) {
//            System.out.print(array[9 - i] + " ");  // Último, penúltimo, antepenúltimo
//            System.out.print(array[i] + " ");      // Primero, segundo, tercero
//        }
    }
}
