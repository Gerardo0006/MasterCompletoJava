/*
public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        //Declaramos/instanciamos los objetos
        //Asignando valores a los atributos fabricante y modelo a través del método constructor
        Automovil jettaGli = new Automovil("Volkswagen", "Jetta GLI");
        //jettaGli.setColor("Negro");
        //Asignamos color con la constante final
        //jettaGli.setColor(Automovil.COLOR_NEGRO);
        //Asignamos el color con enum
        jettaGli.setColor(Color.NEGRO);
        jettaGli.setCilindrada(2.0);

        Automovil mazda = new Automovil("Mazda", "Mazda 3");
        //mazda.setColor("Gris Polimetal");
        //Asignamos color con la constante final
        mazda.setColor(Color.GRIS_MAZDA);
        mazda.setCilindrada(2.5);
*/

        //Creamos otra instancia con 4 parámetros
//        Automovil honda = new Automovil("Honda", "Civic", /*Cambiamos tipo de dato String por Color*/ /*"Gris Meteoro"*/ Color.GRIS_HONDA, 2.0);
        //Creamos otra instancia para comparar
        //Le pasamos por parámetro el color de la constante final
//        Automovil honda2 = new Automovil("Honda", "Civic", /*Cambiamos tipo de dato String por Color*/ /*Automovil.COLOR_GRIS_HONDA*/ Color.GRIS_HONDA, 2.0);
        //Creamos otra instancia sin valores para agregar validaciones de null en la sobreescritura de equals
//        Automovil auto = new Automovil();

        //Modificamos el atributo estático colorPatente
/*        Automovil.setColorPatente("Blanco");

        //Usaremos el método set para asignar tipo de vehículo usando el enum TipoAutomovil
        //Asignamos tipo a Jetta
        jettaGli.setTipo(TipoAutomovil.SEDAN);
        //Asignamos tipo a Mazda
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        //Asignamos tipo a Honda
        honda.setTipo(TipoAutomovil.SEDAN);
        //Asignamos tipo a Honda2
        honda2.setTipo(TipoAutomovil.COUPE);

        System.out.println(jettaGli.verDetalle());
        System.out.println("----------------------");
        System.out.println(mazda.verDetalle());
        System.out.println("----------------------");
        System.out.println(honda.verDetalle());
        System.out.println("----------------------");
        System.out.println("honda2\n" + honda2.verDetalle());
        System.out.println("----------------------");
        System.out.println();
        System.out.println(jettaGli.toString());
        System.out.println("----------------------");
        System.out.println(mazda.toString());
        System.out.println("----------------------");
        System.out.println(honda.toString());
        System.out.println("----------------------");

        System.out.println("Velocidad máxima en carretera -> " + Automovil.VELOCIDAD_MAX_CARRETERA + "KM/H");
        System.out.println("Velocidad máxima en ciudad -> " + Automovil.VELOCIDAD_MAX_CIUDAD + "KM/H");

        System.out.println("--------------------");
        //Ahora definimos una variable de tipo tipoAutomovil para imprimir toda la info
        TipoAutomovil tipoJetta = jettaGli.getTipo();
        System.out.println("jettaGli Tipo -> " + tipoJetta.getNombre());
        System.out.println("jettaGli numPuertas -> " + tipoJetta.getNumeroPuertas());
        System.out.println("jettaGli Descripción -> " + tipoJetta.getDescripcion());
    }
}
*/