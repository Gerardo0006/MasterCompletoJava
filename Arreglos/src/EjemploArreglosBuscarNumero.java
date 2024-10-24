import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[10];

        //Llenamos el array
        for (int i = 0; i<nums.length; i++){
            System.out.print("Ingrese valor para " + i + ": ");
            nums[i] = scanner.nextInt();
        }

        //Buscamos el valor que queremos encontrar en el array
        System.out.print("\nIngresa el valor que deseas buscar en el array: ");
        int num = scanner.nextInt();
        //Solución mía
        /*int pos = -1; //Asignando -1 indicamos que no se encontró inicialmente
        boolean encontrado = false;
        for (int i=0; i<nums.length; i++){
            if (num == nums[i]){
                encontrado = true;
                pos = i;
                break; //Salimos del bucle en cuantro encuentra el valor, ésto mejora el rendimiento del programa y previene posibles errores
            } else {
                encontrado = false;
            }
        }
        if (encontrado){
            System.out.println("El número fue encontrado en: " + pos);
        } else {
            System.out.println("El número no fue encontrado");
        }*/

        //Solución curso
        int i = 0;
        while (i<nums.length && nums[i] != num){
            i++;
        }
        if (i == nums.length){
            //Recorrió todo el array y no encontró coincidencias
            System.out.println("\nEl número no fué encontrado");
        } else if (num == nums[i]) {
            System.out.println("\nEl número fué encontrado en la posición = " + i);
        }
    }
}
