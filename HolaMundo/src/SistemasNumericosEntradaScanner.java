import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        /*
        //Ventana para ingresar datos
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = Integer.parseInt(numeroStr);

        //int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        //Entero
        System.out.println("numeroDecimal -> [" + numeroDecimal + "] equivale en binario a: " + Integer.toBinaryString(numeroDecimal));

        //Binario
        int numeroBinario = 0B111110100;
        System.out.println("numeroBinario -> [" + Integer.toBinaryString(numeroDecimal)  + "] equivale en decimal a: " + numeroBinario);

        //Octal
        int numeroOctal = 0764;
        System.out.println("numeroDecimal -> [" + numeroBinario + "] equivale en octal a: " + Integer.toOctalString(numeroDecimal));
        System.out.println("numeroOctal -> [" + Integer.toOctalString(numeroDecimal) + "] equivale en decimal a: " + numeroOctal);

        //Hexadecimal
        int numeroHexadecimal = 0X1f4;
        System.out.println("numeroDecimal -> [" + numeroDecimal + "] equivale en hexadecimal a: " + Integer.toHexString(numeroDecimal));
        System.out.println("numeroHexadecimal -> [" + Integer.toHexString(numeroDecimal) + "] equivale en decimal a: " + numeroHexadecimal);

        //Imprimiendo en ventana
        String mensaje = "numeroBinario -> [" + Integer.toBinaryString(numeroDecimal)  + "] equivale en decimal a: " + numeroBinario;
        mensaje = mensaje + "\nnumeroOctal -> [" + Integer.toOctalString(numeroDecimal) + "] equivale en decimal a: " + numeroOctal;
        mensaje += "\nnumeroHexadecimal -> [" + Integer.toHexString(numeroDecimal) + "] equivale en decimal a: " + numeroHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try{
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){
            System.out.println("Error, debe ingresar un número entero");
            main(args);
            //return;
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        
        String resultadoBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        String resultadoOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println("resultadoOctal = " + resultadoOctal);

        String resultadoHex = "numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        String mensaje = resultadoBinario + "\n";
        mensaje = mensaje + resultadoOctal;
        mensaje += "\n" + resultadoHex;
    }
}
