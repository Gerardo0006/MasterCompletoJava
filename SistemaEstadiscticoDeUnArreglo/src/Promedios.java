import java.util.Scanner;

public class Promedios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[7];

        //Llenamos el array
        for (int i=0; i<7; i++){
            System.out.print("Ingresa un número (en el rango -10 -> 10): ");
            array[i] = scanner.nextInt();
        }

        //Calculamos suma de positivos/negativos y número de ceros
        int sumPositives = 0, sumNegatives = 0, count = 0;
        int countPos = 0, countNeg = 0;
        for (int i = 0; i<7; i++){
            if (array[i] > 0){
                sumPositives += array[i];
                countPos++;
            } else if (array[i] < 0) {
                sumNegatives += array[i];
                countNeg++;
            } else {
                count++;
            }
        }

        //Agregamos validaciones y Calculamos los promedios
        float averagePos = 0, averageNeg = 0;
        if (countPos == 0){
            System.out.println("\nImposible calcular el promedio de los positivos porque no se ingresó ninguno");
        } else {
            averagePos = (float) sumPositives/countPos;
            //Imprimimos promedios y número de ceros
            System.out.println("\nPromedio números positivos = " + averagePos);
        }
        if (countNeg == 0){
            System.out.println("\nImposible calcular el promedio de los negativos porque no se ingresó ninguno");
        } else {
            averageNeg = (float) sumNegatives/countNeg;
            System.out.println("\nPromedio números negativos = " + averageNeg);
        }
        if (count == 0){
            System.out.println("\nImposible calcular la cantidad de ceros porque no se ingresó ninguno");
        }else {
            System.out.println("\nNúmero de ceros en el arreglo = " + count);
        }
    }
}
