
public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        //Instanciamos objetos
        //Le pasamos los valores de los atributos fabricante y modelo
        Automovil subaru = new Automovil("Subaru", "Impreza");
        Automovil mazda = new Automovil("Impreza", "Mazda 3 Hatchback", "Gris Rata", 3.0);
        //Instanciamos un nuevo Objeto Automovil (vacío y después le pasamos por argumento el valor de los atributos)
        Automovil nissan = new Automovil("Nissan", "370z", "rojo", 3.0, 40);
        Automovil nissan2 = new Automovil("Nissan", "370z", "rojo", 3.0, 40);
        //Creamos un nuevo objeto vacío para ejemplo
        Automovil auto = new Automovil();
        //Setteamos la capacidad del tanque de gasolina con nuestro método set
        Automovil.setCapacidadEstanqueEstatico(45);

        subaru.setColor("Azúl Metálico");
        subaru.setCilindrada(3.0);

        //Cambiamos el color del atributo estático
//        Automovil.colorPatente = "verde"; // -> nissan.colorPatente = "verde";
        nissan2.setColor("Amarillo"); //Solamente cambiamos el color de nissan2
        Automovil.setColorPatente("azul");

        //Imprimimos los valores de los objetos
        System.out.println(subaru.verDetalle()); //Nombre del objeto seguido de punto, seguido de detalle
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println();
        System.out.println(nissan.verDetalle());
        System.out.println();
        System.out.println(nissan2.verDetalle());
        System.out.println();

        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilómetros por litro: " + Automovil.calcularConsumoEstatico(300, 60));
    }

}
