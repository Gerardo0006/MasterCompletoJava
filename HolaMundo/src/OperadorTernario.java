import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //Operador Ternario
        String variable1 = 7==7 ? "Son iguales los dos valores" : "No son iguales los dos valores";
        System.out.println("variable1 = " + variable1);
        String variable2 = 7==5 ? "Son iguales los dos valores" : "No son iguales los dos valores";
        System.out.println("variable2 = " + variable2);

        System.out.println("--------------------------------------------------------------------");

        String estado = "";
        double promedio = 0.0;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación de Matemáticas (0-10): ");
        matematicas = scanner.nextDouble();
        System.out.print("Ingrese la calificación de Ciencias (0-10): ");
        ciencias = scanner.nextDouble();
        System.out.print("Ingrese la calificación de Historia (0-10): ");
        historia = scanner.nextDouble();

        promedio = (matematicas+ciencias+historia) / 3;

        estado = promedio>5.5 ? "Aprobado" : "Reprobado";
        //System.out.println("estado = " + estado);
        System.out.println("estado = " + estado);
        System.out.println("promedio = " + promedio);

    }
}
