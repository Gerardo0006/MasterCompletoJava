
public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        //Instanciamos objetos
        //Le pasamos los valores de los atributos fabricante y modelo
        Automovil subaru = new Automovil("Subaru", "Impreza");
        Automovil mazda = new Automovil("Mazda", "Mazda 3 Hatchback", Automovil.COLOR_GRIS/*"Gris Rata"*/, 3.0);
        //Instanciamos un nuevo Objeto Automovil (vacío y después le pasamos por argumento el valor de los atributos)
        Automovil nissan = new Automovil("Nissan", "370z", /*Le pasamos el color pero desde la constante que definimos como atributo en la clase*/Automovil.COLOR_ROJO, 3.0, 40);
        Automovil nissan2 = new Automovil("Nissan", "370z", "rojo", 3.0, 40);
        //Creamos un nuevo objeto vacío para ejemplo
        Automovil auto = new Automovil();
        //Setteamos la capacidad del tanque de gasolina con nuestro método set
        Automovil.setCapacidadEstanqueEstatico(45);

        subaru.setColor("Azúl Metálico");
        subaru.setCilindrada(3.0);

        //Cambiamos el color del atributo estático
//        Automovil.colorPatente = "verde"; // -> nissan.colorPatente = "verde";
        nissan2.setColor(/*Le pasamos el color pero desde la constante que definimos como atributo en la clase*/Automovil.COLOR_AMARILLO/*"Amarillo"*/); //Solamente cambiamos el color de nissan2
        Automovil.setColorPatente(/*Le pasamos el color pero desde la constante que definimos como atributo en la clase*/Automovil.COLOR_AZUL/*"azul"*/);

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

        //Imprimimos las constantes que definimos en la clase Automovil
        //Las constantes pertenecen a la clase, no al objeto
        System.out.println("Velocidad máxima en caretera -> " + Automovil.VELOCIDAD_MAX_CARRETERA + "Km/h");
        System.out.println("Velocidad máxima en ciudad -> " + Automovil.VELOCIDAD_MAXIMA_CIUDAD + "Km/h");
    }

}
