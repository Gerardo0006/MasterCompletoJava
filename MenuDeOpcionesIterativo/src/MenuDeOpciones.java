import javax.swing.*;

public class MenuDeOpciones {
    public static void main(String[] args) {
        String opString;
        int opInt;
        JOptionPane.showMessageDialog(null, "Bienvenido al Menú Interactivo\nPresiona 'ok' para continuar");
        do {
            opString = JOptionPane.showInputDialog("Ingrese la opción que quiera ejecutar:\n" +
                    "\tActualizar........1\n" +
                    "\tEliminar...........2\n" +
                    "\tCrear...............3\n" +
                    "\tListar...............4\n" +
                    "\tSalir.................5");
            opInt = Integer.parseInt(opString);

            switch (opInt){
                case 1:
                    JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente!");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Usuario creado correctamente!");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Usuario listado correctamente!");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "¿Deseas salir?\npresiona 'OK' para salir");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve a intentarlo");
            }
        } while (opInt != 5);

        JOptionPane.showMessageDialog(null, "Haz salido con éxito");

    }
}
