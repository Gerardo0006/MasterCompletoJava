import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String bornDate;

        Date currentDate = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("currentDate (sin formato)= " + currentDate);
        System.out.println("formatDate (con formato)= " + formatDate.format(currentDate));

        //Parseamos el Objeto con la fecha formateada a String
        String currentDateString = formatDate.format(currentDate);
        //Parseamos el String de la fecha con formato a Objeto de clase Date
        Date currentDateObject = formatDate.parse(currentDateString);

        System.out.print("Ingresa tu fecha de nacimiento (dd-MM-yyyy): ");
        bornDate = scanner.next();

        //Convertimos la fecha tipo String a Objeto de la clase Date
        Date bornDateObject = formatDate.parse(bornDate);

        //Comparamos las fechas para calcular la edad
        long startsDate = bornDateObject.getTime();
        long endsDate = currentDateObject.getTime();
        long daysStartsDate = (long) Math.floor(startsDate / (1000*60*60*24));
        long daysEndsDate = (long) Math.floor(endsDate / (1000*60*60*24));
        long totalDays = daysEndsDate - daysStartsDate;

        System.out.println("totalDays = " + totalDays);

    }
}
