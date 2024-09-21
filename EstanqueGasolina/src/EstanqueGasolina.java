import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        double capacidadActualGasolina;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad actual en lts: ");
        capacidadActualGasolina = scanner.nextInt();

        if (capacidadActualGasolina == 70){
            System.out.println("Estanque lleno");
        } else if (capacidadActualGasolina>=60 && capacidadActualGasolina<70){
            System.out.println("Estaque casi lleno");
        } else if (capacidadActualGasolina>=40 && capacidadActualGasolina<60) {
            System.out.println("Estanque 3/4");
        } else if (capacidadActualGasolina>=35 && capacidadActualGasolina<40) {
            System.out.println("Medio estanque");
        } else if (capacidadActualGasolina>=20 && capacidadActualGasolina<35) {
            System.out.println("Suficiente");
        } else if (capacidadActualGasolina>1 && capacidadActualGasolina<20) {
            System.out.println("Insuficiente");
        }
    }
}
