import java.util.Scanner;

public class ImprimirSillaoH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tam;

        //Solicitamos que se ingrese el tamaño de la matriz/silla
        System.out.print("Ingresa el tamaño de la matriz cuadrada (recuerde que corresponderá al tamaño de la silla): ");
        tam = scanner.nextInt();

        //Definimos la matriz
        int[][] matriz = new int[tam][tam];

        //
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j< matriz[i].length; j++){
                if (j == 0 || i == matriz.length-3 || j == matriz[i].length-1){
                    matriz[i][j] = 1;
                }
            }
        }

        //
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
                if (matriz[i].length-1 == 1){
                    matriz[i][j] = 0;
                }
            }
        }

        //Imprimimos la matriz
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j< matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
