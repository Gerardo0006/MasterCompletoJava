import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double area, radio;

        System.out.println("Calculemos el área de un circulo");
        System.out.print("Ingresa la medida del radio: ");
        radio = scanner.nextDouble();

        area = (Math.PI * Math.pow(radio, 2));
        //area = Math.round(area);

        System.out.println(String.format("El área del circulo es = %.2f u^2", area)); //Usamos String.format para sólo imrpimir 2 decimales en el valor final
    }
}
