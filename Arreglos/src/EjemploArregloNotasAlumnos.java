import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declaramos arrays
        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumaNotasMate = 0, sumaNotasHist = 0, sumaNotasLeng = 0;

        //Inicializamos los arrays
        claseMatematicas = new double[5];
        claseHistoria = new double[5];
        claseLenguaje = new double[5];

        //Llenamos el array de Matemáticas
        System.out.println("=== Ingrese las calificaciones de Matemáticas ===");
        for (int i = 0; i<claseMatematicas.length; i++){
            System.out.print("Ingresa calificación para el alumno " + (i+1) + ": ");
            claseMatematicas[i] = scanner.nextDouble();
        }

        //Llenamos el array de Historia
        System.out.println("=== Ingrese las calificaciones de Historia ===");
        for (int i = 0; i<claseHistoria.length; i++){
            System.out.print("Ingresa calificación para el alumno " + (i+1) + ": ");
            claseHistoria[i] = scanner.nextDouble();
        }

        //Llenamos el array de Lenguaje
        System.out.println("=== Ingrese las calificaciones de Lenguaje ===");
        for (int i = 0; i<claseMatematicas.length; i++){
            System.out.print("Ingresa calificación para el alumno " + (i+1) + ": ");
            claseLenguaje[i] = scanner.nextDouble();
        }

        //Calculamos la suma general de cada asignatura
        for (int i = 0; i<5; i++){
            sumaNotasMate += claseMatematicas[i];
            sumaNotasHist += claseHistoria[i];
            sumaNotasLeng += claseLenguaje[i];
        }

        //Calculamos el promedio general del grupo para cada asignatura
        double promedioMate = 0, promedioHist = 0, promedioLeng = 0;
        promedioMate = sumaNotasMate / claseMatematicas.length;
        promedioHist = sumaNotasHist / claseHistoria.length;
        promedioLeng = sumaNotasLeng / claseLenguaje.length;

        //Calculamos el promedio general del grupo
        double promGralGrupal = 0;
        promGralGrupal = (promedioMate+promedioHist+promedioLeng)/3;

        //Imprimimos los promedios
        System.out.println("Promedio grupal Matemáticas = " + promedioMate);
        System.out.println("Promedio grupal Historia = " + promedioHist);
        System.out.println("Promedio grupal Lenguaje = " + promedioLeng);
        System.out.println("Promedio grupal General = " + promGralGrupal);

        //Implementación de menú para preguntar si desea ver el promedio de un alumno en particular
//        do {
//            System.out.println("¿Desea ver el promedio de un alumno? (S/N)");
//
//        }

    }
}
