import java.util.Scanner;

public class MenorDeMinimoDiezNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nums[];
        nums = new int[15];
        int num;
        int numMenor = 999999999;

        System.out.print("Ingresa la cantidad de números que vas a ingresar (mínimo 10): ");
        num = scanner.nextInt();

        for (int i=0; i<num; i++){
            System.out.print("Ingresa valor para [" + i + "] = ");
            nums[i] = scanner.nextInt();
            if (nums[i] < numMenor){
                numMenor = nums[i];
            }
        }

        if (numMenor < 10){
            System.out.println("El número menor es: " + numMenor + " y es menor que 10");
        } else {
            System.out.println("El número menor es: " + numMenor + " y es mayor/igual que 10");
        }
    }
}
