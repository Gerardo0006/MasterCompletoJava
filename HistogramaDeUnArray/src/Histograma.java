import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[12];
        int value;

        System.out.println("Ingresa 12 valores (que estén en el rango 1-6)\n");
        for (int i=0; i<12; i++){
            do {
                System.out.print("Ingresa valor para array[" + i + "] : ");
                value = scanner.nextInt();
                if (value<1 || value>6){
                    System.out.print("Número inválido, intente nuevamanete");
                }
            }while (value<1 || value>6);

            //Almacenamos valores en el índice que corresponda
            array[i] = value;
        }

        //Imprimimos el array
        for (int i = 0; i<12; i++){
            System.out.println("array[" + i + "] -> " + array[i]);
        }

        //Calculamos la frecuencia de cada número
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
        for (int i = 0; i<12; i++){
            switch (array[i]){
                case 1:
                    num1++;
                    break;
                case 2:
                    num2++;
                    break;
                case 3:
                    num3++;
                    break;
                case 4:
                    num4++;
                    break;
                case 5:
                    num5++;
                    break;
                case 6:
                    num6++;
                default:
                    break;
            }
        }

        //Imprimimos el histograma
        System.out.println("\n### HISTOGRAMA ###");
        System.out.print("1: ");
        for (int i=0; i<num1; i++){
            System.out.print("*");
        }

        System.out.print("\n2: ");
        for (int i=0; i<num2; i++){
            System.out.print("*");
        }

        System.out.print("\n3: ");
        for (int i=0; i<num3; i++){
            System.out.print("*");
        }

        System.out.print("\n4: ");
        for (int i=0; i<num4; i++){
            System.out.print("*");
        }

        System.out.print("\n5: ");
        for (int i=0; i<num5; i++){
            System.out.print("*");
        }

        System.out.print("\n6: ");
        for (int i=0; i<num6; i++){
            System.out.print("*");
        }
    }
}