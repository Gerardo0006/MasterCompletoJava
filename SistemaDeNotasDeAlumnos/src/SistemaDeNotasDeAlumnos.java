import java.util.Scanner;

public class SistemaDeNotasDeAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorCincos=0, contadorCuatros=0, contadorUnos=0, cont=0;
        double nota, sumaNotasCinco=0, sumaNotasCuatro=0, sumaTotal=0;
        boolean flag = true;

        for (int i=0; i<20; i++){
            System.out.print("Ingresa nota: ");
            nota = scanner.nextDouble();

            if (nota == 0){
                System.out.println("Error de ejecución por ingresar '0'");
                flag = false;
                break;
            }

            if (nota > 5){
                contadorCincos++;
                sumaNotasCinco += nota;
            } else if (nota < 4) {
                if (nota == 1){
                    contadorUnos++;
                }
                contadorCuatros++;
                sumaNotasCuatro += nota;
            }
        }

        sumaTotal = (sumaNotasCinco+sumaNotasCuatro);

        if (flag){
            System.out.println("El promedio de todas las notas mayores a 5 es: " + (sumaNotasCinco/contadorCincos));
            System.out.println("El promedio de todas las notas menores a 4 es: " + (sumaNotasCuatro/contadorCuatros));
            System.out.println("El número de notas '1' es: " + contadorUnos);
            System.out.println("El promedio general es: " + sumaTotal/20);
        }
    }
}
