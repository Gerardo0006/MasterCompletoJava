import java.util.Scanner;

public class MultiplicarSinSimbolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, producto=0;

        System.out.print("Ingresa el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        num2 = scanner.nextInt();

        for (int i = 0; i < num2 ; i++) {
            producto += num1;
        }

        System.out.println("producto = " + producto);
    }
}
