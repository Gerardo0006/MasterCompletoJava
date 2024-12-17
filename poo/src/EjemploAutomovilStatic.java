
public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        //Instanciamos objetos
        //Le pasamos los valores de los atributos fabricante y modelo
        Automovil subaru = new Automovil("Subaru", "Impreza");
        //hacemos uso del enum TipoAutomovil para subaru
        subaru.setTipo(TipoAutomovil.COUPE);
        Automovil mazda = new Automovil("Mazda", "Mazda 3 Hatchback", Color.GRIS/*Le pasamos el color pero desde el enum (constante)Automovil.COLOR_GRIS*//*"Gris Rata"*/, 3.0);
        //hacemos uso del enum TipoAutomovil para Mazda
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        //Instanciamos un nuevo Objeto Automovil (vacío y después le pasamos por argumento el valor de los atributos)
        //Automovil nissan = new Automovil("Nissan", "370z", /*Le pasamos el color pero desde la constante que definimos como atributo en la clase*/Automovil.COLOR_ROJO, 3.0, 40);
        /*Le pasamos el color pero desde el enum (constante)*/
        Automovil nissan = new Automovil("Nissan", "370z", Color.ROJO, 3.0, 40);
        //hacemos uso del enum TipoAutomovil para nissan
        nissan.setTipo(TipoAutomovil.COUPE);
        /*Le pasamos el color pero desde el enum (constante)*/
        Automovil nissan2 = new Automovil("Nissan", "NP300", Color.BLANCO, 1.5, 40);
        //hacemos uso del enum TipoAutomovil para nissan2
        nissan2.setTipo(TipoAutomovil.PICKUP);

        //Creamos un nuevo objeto vacío para ejemplo
        Automovil auto = new Automovil();
        //Setteamos la capacidad del tanque de gasolina con nuestro método set
        Automovil.setCapacidadEstanqueEstatico(45);

        /*Le pasamos el color pero desde el enum (constante)*/
        subaru.setColor(Color.AZUL/*"Azúl Metálico"*/);
        subaru.setCilindrada(3.0);

        //Cambiamos el color del atributo estático
//        Automovil.colorPatente = "verde"; // -> nissan.colorPatente = "verde";
//        nissan2.setColor(/*Le pasamos el color pero desde la constante que definimos como atributo en la clase*/Automovil.COLOR_AMARILLO/*"Amarillo"*/); //Solamente cambiamos el color de nissan2
//        Automovil.setColorPatente(/*Le pasamos el color pero desde la constante que definimos como atributo en la clase*/Automovil.COLOR_AZUL/*"azul"*/);
        /*Le pasamos el color pero desde el enum (constante)*/
        nissan2.setColor(Color.AMARILLO); //Solamente cambiamos el color de nissan2
        /*Le pasamos el color pero desde el enum (constante)*/
        Automovil.setColorPatente(Color.AZUL);

        //Imprimimos los valores de los objetos
        System.out.println(subaru.verDetalle()); //Nombre del objeto seguido de punto, seguido de detalle
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println();
        System.out.println(nissan.verDetalle());
        System.out.println();
        System.out.println(nissan2.verDetalle());
        System.out.println();

//        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente()/*.getColor()*/);
        System.out.println("Kilómetros por litro: " + Automovil.calcularConsumoEstatico(300, 60));

        //Imprimimos las constantes que definimos en la clase Automovil
        //Las constantes pertenecen a la clase, no al objeto
        System.out.println("Velocidad máxima en caretera -> " + Automovil.VELOCIDAD_MAX_CARRETERA + "Km/h");
        System.out.println("Velocidad máxima en ciudad -> " + Automovil.VELOCIDAD_MAXIMA_CIUDAD + "Km/h");

        TipoAutomovil tipouSubaru = subaru.getTipo();
        System.out.println("\ntipoSubaru.getNombre -> " + tipouSubaru.getNombre());
        System.out.println("tipoSubaru.getDescripcion -> " + tipouSubaru.getDescripcion());
    }

}
