import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nameA1, nameA2, nameB1, nameB2, nameC1, nameC2, finalName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la primer persona: ");
        nameA1 = scanner.nextLine();
        nameA2 = nameA1.toUpperCase().charAt(1) + "." + nameA1.substring(nameA1.length()-2);
        System.out.println("Ingresa el nombre de la primer persona: ");
        nameB1 = scanner.nextLine();
        nameB2 = nameB1.toUpperCase().charAt(1) + "." + nameB1.substring(nameB1.length()-2);
        System.out.println("Ingresa el nombre de la primer persona: ");
        nameC1 = scanner.nextLine();
        nameC2 = nameC1.toUpperCase().charAt(1) + "." + nameC1.substring(nameC1.length()-2);

        finalName = nameA2 + "_" + nameB2 + "_" + nameC2;
        System.out.println("finalName = " + finalName);

    }
}
