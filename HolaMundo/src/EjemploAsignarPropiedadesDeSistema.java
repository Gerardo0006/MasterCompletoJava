import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try{
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada", "Este es el valor seteado con el método setProperty");

            System.setProperties(p);
            Properties ps = System.getProperties();
            ps.list(System.out);
        } catch(Exception e){
            System.err.println("No existe el archivo = " + e); //System.err.println -> pinta el msj de rojo
            System.exit(1); //retorna el status 1 que significa que hubo errores en la ejecución
            //main(); //Es posible invocar nuevamente el método main para permitir al ususario cargar/ingresar un nuevo archivo
        }
    }
}
