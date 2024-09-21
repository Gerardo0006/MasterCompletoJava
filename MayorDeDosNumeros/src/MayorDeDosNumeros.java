import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        int num1, num2, mayor = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        mayor = (num1>num2) ? num1 : num2;

        System.out.println("El número más grande es: " + mayor);
    }
}
