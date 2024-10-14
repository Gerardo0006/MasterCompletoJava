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
            System.out.println("No existe el archivo = " + e);
        }
    }
}
