import java.util.Scanner;

public class MayorOcurrencia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int[] counts = new int[10];

        System.out.println("=== Ingresa valores (en el rango 1-9) ===");

        //Llenamos el array
        for (int i = 0; i < 10; i++) {
            int value;
            do {
                System.out.print("Ingresa valor para array[" + i + "] -> ");
                value = scanner.nextInt();
                //Validamos que se ingrese un número en el rango solicitado
                if (value < 1 || value > 9) {
                    System.out.println("Por favor, ingresa un valor válido (1-9).");
                }
            } while (value < 1 || value > 9);

            array[i] = value; // Solo se guarda un valor válido
            counts[value]++; // Contamos ocurrencias
        }

        //Buscamos el número con más concurrencias
        int maxCount = 0;
        int mostFrequentNum = -1;
        for (int i = 1; i<10; i++){
            if (counts[i] > maxCount){
                maxCount = counts[i];
                mostFrequentNum = i;
            }
        }

        //Imprimimos el resultado
        if (mostFrequentNum != -1){
            System.out.println("El número que más aparece es: " + mostFrequentNum + " y aparece " + maxCount + " veces");
        } else {
            System.out.println("No se encontraron coincidencias en ningún número");
        }
    }
}