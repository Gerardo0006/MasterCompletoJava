import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        //En este programa se va a converir una fecha Objeto de clase String a Objeto de clase Date

        Scanner scanner = new Scanner(System.in);
        //Instanciamos el objeto para dar formato a las fechas
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Ingrese una fecha con el formato 'yyyy-MM-dd': ");
        try {
            //Instanciamos el Objeto de la clase Date con el valor que se ingresa por teclado
            Date fecha1 = formatDate.parse(scanner.next());
            System.out.println("fecha = " + fecha1);
            System.out.println("fecha con formato = " + formatDate.format(fecha1));

            //Vamos a comparar fechas
            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            //Comparando con métodos after, before y equals
            if (fecha1.after(fecha2)){
                System.out.println("La fecha 1 (ingresada por el usuario) es más reciente que fecha2 (fecha actual)");
            } else if (fecha1.before(fecha2)) {
                System.out.println("La fecha 1 (ingresada por el usuario) es más antigua que la fecha2 (fecha actual)");
            }else if (fecha1.equals(fecha2)){
                System.out.println("Las fechas son iguales");
            }

            //Comparando con método compareTo()
            if (fecha1.compareTo(fecha2) > 0){
                System.out.println("La fecha 1 (ingresada por el usuario) es más reciente que fecha2 (fecha actual)");
            } else if (fecha1.compareTo(fecha2) < 0) {
                System.out.println("La fecha 1 (ingresada por el usuario) es más antigua que la fecha2 (fecha actual)");
            } else if (fecha1.compareTo(fecha2) == 0) {
                System.out.println("Las fechas son iguales");
            }

        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
