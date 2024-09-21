import javax.swing.*;

public class NombreMasLargoDeTresPersonas {
    public static void main(String[] args) {
        String name1, name2, name3, longerName;

        name1 = JOptionPane.showInputDialog("Ingresa el nombre completo de la persona 1:");
        name2 = JOptionPane.showInputDialog("Ingresa el nombre completo de la persona 2:");
        name3 = JOptionPane.showInputDialog("Ingresa el nombre completo de la persona 3:");

        //System.out.println("name1.length() = " + name1.length());
        longerName = (name1.length() > name2.length()) ? name1 : (name2.length() > name3.length() ? name2 : name3);

        JOptionPane.showMessageDialog(null, "El nombre más largo es '".concat(longerName).concat("'"));
    }
}
