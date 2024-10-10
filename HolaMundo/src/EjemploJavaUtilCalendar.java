import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        //Instanciamos Objeto de la clase Calendar
        //Este tipo de Objetos no se puede instanciar...
        Calendar calendario = Calendar.getInstance();
        //Podemos setear los valores pásandolos por parámetro o de manera explícita cada valor
            // calendario.set(2010, Calendar.JUNE, 21, 8, 0, 0);
        //La siguiente es de manera explícita
        calendario.set(Calendar.YEAR, 2010);
        calendario.set(Calendar.MONTH, 5);
        calendario.set(Calendar.DAY_OF_MONTH, 21);

        calendario.set(Calendar.HOUR, 8); //Formato 24hrs -> 20:00 hrs
//        calendario.set(Calendar.HOUR_OF_DAY, 8); //Formato 12hrs -> 8:00 a.m
        calendario.set(Calendar.AM_PM, Calendar.AM);
        calendario.set(Calendar.MINUTE, 0);
        calendario.set(Calendar.SECOND, 0);


        //Instanciamos Objeto de la clase Date
        Date fecha = calendario.getTime();
        System.out.println("fechaSinFormato = " + fecha);

        SimpleDateFormat fechaFormato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        String fechaConFormato = fechaFormato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}
