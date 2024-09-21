import java.util.Scanner;

public class OperadoresLogicosLoginArreglos {
    public static void main(String[] args) {

        /*String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "gerardo";
        passwords[0] = "12345";

        usernames[1] = "Rolando";
        passwords[1] = "12345";*/
        //Una manera más óptima de definir los arreglos es la siguiente:
        String[] usernames = {"gerardo", "rolando", "admin"};
        String[] passwords = {"12345", "12345", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String user = scanner.next();

        System.out.print("Ingrese la contraseña para " + user + ": ");
        String pass = scanner.next();

        boolean esAutenticado = false;

        for (int i=0; i< usernames.length; i++){
            if (usernames[i].equals(user) && passwords[i].equals(pass)){
                esAutenticado = true;
                break; //Corta la ejecución del programa en el momento que esAutenticado = true;
            }
        }

        if (esAutenticado){
            System.out.println("Bienvenido ".concat(user).concat("!"));
        } else {
            System.out.println("Usuario y/o contraseña incorrecto(s)");
        }
    }
}
