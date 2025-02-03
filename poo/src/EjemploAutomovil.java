/* Comentado para no renombrar/cambiar Strings por Enum Color
import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        //Declaramos/instanciamos los objetos
        //Asignando valores a los atributos fabricante y modelo a través del método constructor
        Automovil jettaGli = new Automovil("Volkswagen", "Jetta GLI");
        Automovil mazda = new Automovil("Mazda", "Mazda 3");
        //Creamos otra instancia de la clase (objeto) pero sin parámetros
        //Automovil honda = new Automovil();
        //Creamos otra instancia con 4 parámetros
        Automovil honda = new Automovil("Honda", "Civic", "Gris Meteoro", 2.0);
        //Creamos otra instancia para comparar
        Automovil honda2 = new Automovil("Honda", "Civic", "Gris Meteoro", 2.0);
        //Creamos otra instancia sin valores para agregar validaciones de null en la sobreescritura de equals
        Automovil auto = new Automovil();
        //Creamos nueva instancia de la clase Date para probar la validación del método equals
        Date fecha = new Date();
*/
        //Asignamos valores a los atributos del objeto jettaGli
        /*De éste modo estamos accediendo/asignando valores a los atributos de manera directa; se hace
        de esta manera cuando los atributos son publicos. Cuando son privados se accede a
        través del método setter.
        jettaGli.fabricante = "Volkswagen";
        jettaGli.modelo = "Jetta GLI";
        jettaGli.color = "Negro";
        jettaGli.cilindrada = 2.0;*/
        //Asignando valores a los atributos a través del método set/setter.
        /*jettaGli.asignarFabricante("Volkswagen");
        jettaGli.asignarModelo("Jetta GLI");*/
/*        jettaGli.setColor("Negro");
        jettaGli.setCilindrada(2.0);
        //jettaGli.asignarCapacidadTanque();
*/
        //Asignamos valores a los atributos del objeto mazda3
        /*De éste modo estamos accediendo/asignando valores a los atributos de manera directa; se hace
        de esta manera cuando los atributos son publicos. Cuando son privados se accede a
        través del método setter.
        mazda.fabricante = "Mazda";
        mazda.modelo = "Mazda 3 sedán";
        mazda.color = "Gris polimetal";
        mazda.cilindrada = 2.5;*/
        //Asignando valores a los atributos a través del método set/setter.
        /*mazda.asignarFabricante("Mazda");
        mazda.asignarModelo("Mazda 3");*/
/*        mazda.setColor("Gris Polimetal");
          mazda.setCilindrada(2.5);
*/
//        mazda.asignarCapacidadTanque();

//        //Imprimimos los valores de jettaGli
//        System.out.println("jettaGli.fabricante = " + jettaGli.fabricante);
//        System.out.println("jettaGli.modelo = " + jettaGli.modelo);
//        System.out.println("jettaGli.color = " + jettaGli.color);
//        System.out.println("jettaGli.cilindrada = " + jettaGli.cilindrada);
//
//        //Imprimimos los valores de mazda
//        System.out.println("jettaGli.fabricante = " + jettaGli.fabricante);
//        System.out.println("jettaGli.modelo = " + jettaGli.modelo);
//        System.out.println("jettaGli.color = " + jettaGli.color);
//        System.out.println("jettaGli.cilindrada = " + jettaGli.cilindrada);

        //Imprimimos los atributos de los objetos a través del método .detalle()
        /*jettaGli.verDetalle();
        System.out.println("------------------");
        mazda.verDetalle();
        System.out.println("------------------");*/
/*        System.out.println("jettaGli\n" + jettaGli.verDetalle());
        System.out.println(jettaGli.acelerar(3000));
        System.out.println(jettaGli.frenar());
        System.out.println("------------------");
        System.out.println("mazda\n" + mazda.verDetalle());
        System.out.println(mazda.acelerar(3000));
        System.out.println(mazda.frenar());
        System.out.println();
        System.out.println(mazda.acelerarFrenar(2500));
        System.out.println("El consumo de gasolina en Mazda 3 es: " + mazda.calcularConsumo(300, 0.6f) + "Km/lt");
        System.out.println("El consumo de gasolina en Mazda 3 es: " + mazda.calcularConsumo(300, 60) + "Km/lt");
        System.out.println("------------------");
        System.out.println();
        System.out.println("Imprimiendo con método leer/get");
*/
//        System.out.println("jettaGli.leerFabricante() = " + jettaGli.leerFabricante());
//        System.out.println("mazda.leerFabricante() = " + mazda.leerFabricante());
/*        System.out.println("jettaGli.leerFabricante() = " + jettaGli.getFabricante());
        System.out.println("mazda.leerFabricante() = " + mazda.getFabricante());
        System.out.println("honda.verDetalle()\n" + honda.verDetalle());
        System.out.println("\nComparando con '=='. ¿honda = honda2? -> " + (honda == honda2));
        System.out.println("Comparando con equals sobreescrito. ¿honda = honda2? -> " + honda.equals(honda2));
        System.out.println("Comparando con objeto vacío (con validación en el método) ¿honda = auto? -> " + honda.equals(auto));
        System.out.println("Comparando objetos de distintas clases ¿fecha = honda? -> " + honda.equals(fecha));
        System.out.println("-------------------------------------------------");
        System.out.println("Sobreescritura del método toString Objeto honda: " + honda.toString());
        System.out.println("-------------------------------------------------");
    }
}
*/
//Las últimas líneas comentadas son las que inician y terminan con /**/ indentados hasta la izquierda