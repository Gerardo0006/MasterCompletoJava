import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op1, numberMonth;
        char op2;
        String opName, nameMonth=null;

        System.out.print("Ingresa un número entre 1-3: ");
        op1 = scanner.nextInt();

        switch (op1){
            case 1:
                System.out.println("Es el número 1");
                break;
            case 2:
                System.out.println("El número es 2");
                break;
            case 3:
                System.out.println("El número es 3");
                break;
            default:
                System.out.println("El número que ingresó no corresponde al rango 1-3");
        }

        System.out.print("Ingresa un caracter que corresponda a una vocal: ");
        op2 = scanner.next().charAt(0);

        switch (op2){
            case 'a':
                System.out.println("La vocal es A");
                break;
            case 'e':
                System.out.println("La vocal es E");
                break;
            case 'i':
                System.out.println("La vocal es I");
                break;
            case 'o':
                System.out.println("La vocal es O");
                break;
            case 'u':
                System.out.println("La vocal es U");
                break;
            default:
                System.out.println("La letra ingresada no es una vocal");
        }

        System.out.print("Ingresa un nombre: ");
        opName = scanner.next();

        switch (opName){
            case "Gerardo":
                System.out.println("Sí es un miembro de la familia");
                break;
            case "Rolando":
                System.out.println("Sí es un miembro de la familia");
                break;
            case "Edith":
                System.out.println("Sí es un miembro de la familia");
                break;
            case "Karina":
                System.out.println("Sí es un miembro de la familia");
                break;
            case "Guadalupe":
                System.out.println("Sí es un miembro de la familia");
                break;
            default:
                System.out.println("No es un miembro de la familia");
        }

        System.out.print("Ingresa un número 1-12: ");
        numberMonth = scanner.nextInt();

        switch(numberMonth){
            case 1:
                nameMonth = "Enero";
                break;
            case 2:
                nameMonth = "Febrero";
                break;
            case 3:
                nameMonth = "Marzo";
                break;
            case 4:
                nameMonth = "Abril";
                break;
            case 5:
                nameMonth = "Mayo";
                break;
            case 6:
                nameMonth = "Junio";
                break;
            case 7:
                nameMonth = "Julio";
                break;
            case 8:
                nameMonth = "Agosto";
                break;
            case 9:
                nameMonth = "Septiembre";
                break;
            case 10:
                nameMonth = "Octubre";
                break;
            case 11:
                nameMonth = "Noviembre";
                break;
            case 12:
                nameMonth = "Diciembre";
                break;
            default:
                /*System.out.println("El número que ingresó no está en el rango 1-12");*/
                nameMonth = "Indefinido";
        }
        System.out.println("nameMonth = " + nameMonth);

    }
}
