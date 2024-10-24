import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[6];

        //Llenamos el array
        for (int i = 0; i<names.length; i++){
            System.out.print("Ingrese nombre para índice " + i + ": ");
            names[i] = scanner.next();
        }

        //Buscamos el valor que queremos encontrar en el array
        System.out.print("\nIngresa el nombre que deseas buscar en el array: ");
        String name = scanner.next();

        //Solución curso
        int i = 0;
        while (i<names.length && !names[i].equalsIgnoreCase(name)){
            i++;
        }
        if (i == names.length){
            //Recorrió todo el array y no encontró coincidencias
            System.out.println("\nEl número no fué encontrado");
        } else if (names[i].toLowerCase().compareTo(name.toLowerCase()) == 0) {
            System.out.println("\nEl número fué encontrado en la posición = " + i);
        }
    }
}
