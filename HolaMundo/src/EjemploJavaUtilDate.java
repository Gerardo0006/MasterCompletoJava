import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        //Instanciamos Objeto de la clase Date
        Date fecha = new Date();
        System.out.println("Objeto fecha = " + fecha);

        //Instanciamos Objeto de la clase SimpleDateFormat
        //Esta clase nos ayuda a darle un formato específico (que nosotros queramos) a la fecha
        //Documentación de clase SimpleDateFormat: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd/mm/yyyy");
        String fechaString = dateFormat.format(fecha);
        System.out.println("fechaString = " + fechaString);

        SimpleDateFormat otherFormat= new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy");
        String fechaString2 = otherFormat.format(fecha);
        System.out.println("fechaString2 = " + fechaString2);

        System.out.println("-------------------------------------------");

        //Poniendo a Prueba el método getTime()
        Date fechaEjemploGetDate1 = new Date();
        System.out.println("Objeto fechaEjemploGetDate1 = " + fechaEjemploGetDate1);

        long j = 0;
        for (int i = 0; i < 10000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date fechaEjemploGetDate2 = new Date();
        long tiempoFinal = (fechaEjemploGetDate2.getTime() - fechaEjemploGetDate1.getTime());
        System.out.println("Tiempo de ejecución en el bucle for = " + tiempoFinal + " milisegundos");
    }
}
