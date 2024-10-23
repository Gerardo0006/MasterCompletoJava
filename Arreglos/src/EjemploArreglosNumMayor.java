import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        //Llenamos el array
        for (int i = 0; i< array.length; i++){
            System.out.print("Ingrese valor para array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        //Calculamos el núemro mayor dentro del arreglo
        int mayor = 0;
        for (int i = 0; i< array.length; i++){
            //Ejemplo con operador ternario
            /*mayor = (array[mayor] > array[i]) ? mayor : i;*/
            //A mi manera
            if (array[i] > mayor){
                mayor = array[i];
            }
        }
        System.out.println("mayor = " + mayor);
    }
}
