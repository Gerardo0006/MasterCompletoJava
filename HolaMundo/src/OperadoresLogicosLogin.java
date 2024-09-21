import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username1 = "gerardo";
        String password1 = "12345";
        String username2 = "Rolando";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario: ");
        String user = scanner.next();

        System.out.println("Ingrese la contraseña para " + user + ": ");
        String pass = scanner.next();

        boolean esAutenticado = false;
        if ( (username1.equals(user) && password1.equals(pass)) ||
                (username2.equals(user) && password2.equals(pass)) ){
            esAutenticado = true;
        }

        if (esAutenticado){
            System.out.println("Bienvenido ".concat(user).concat("!"));
        } else {
            System.out.println("Usuario y/o contraseña incorrecto(s)");
        }
    }
}
