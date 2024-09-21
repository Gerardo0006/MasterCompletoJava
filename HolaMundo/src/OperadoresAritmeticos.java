import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("i + j = " + i + j);
        System.out.println("(i+j) = " + (i+j));

        int resta = i-j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i-j));

        int multi = i*j;
        System.out.println("multiplicación = " + multi);

        int div1 = i/j;
        System.out.println("div1 = " + div1);
        float div2 = (float)i/j; //También puede ser -> (float)i/(float)j;
        System.out.println("div2 = " + div2);

        int resto = i%j;
        System.out.println("resto = " + resto);
        resto = 8%5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if (numero%2 == 0){
            System.out.println("El número es Par");
        } else {
            System.out.println("El número es Impar");
        }
    }
}
