import javax.swing.*;

public class SistemasNumericos {
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

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
            main(args);
            //return;
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        
        String resultadoBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        
        int numeroBinario = 0B11110;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println("resultadoOctal = " + resultadoOctal);
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0X1E;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario + "\n";
        mensaje = mensaje + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
