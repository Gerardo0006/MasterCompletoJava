import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
         String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count = nombres.length;

        for (int i=0; i<count; i++){
            if (nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("pepa")){
                continue;
            }
            System.out.println(i + ". " + nombres[i]);
        }

        String buscarNombre = JOptionPane.showInputDialog("Ingrese un nombre para buscarlo en la base de datos: ");
        boolean encontrado = false;
        int pos = 0;
        for (int i=0; i<count; i++){
            if (nombres[i].equalsIgnoreCase(buscarNombre)){
                encontrado = true;
                pos = i;
                break;
            }
        }
        if (encontrado == true){
            JOptionPane.showMessageDialog(null, "El nombre fue encontrado en nuestra base de datos!");
            JOptionPane.showMessageDialog(null, "Índice - " + pos + "\nNombre = " + buscarNombre);
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no existe en la base de datos!");
        }
    }
}
