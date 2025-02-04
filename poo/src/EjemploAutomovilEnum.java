
public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        //Declaramos/instanciamos los objetos
        //Asignando valores a los atributos fabricante y modelo a través del método constructor
        Automovil jettaGli = new Automovil("Volkswagen", "Jetta GLI");
        jettaGli.setColor(Color.NEGRO);
        jettaGli.setMotor(new Motor(2.0, TipoMotor.GASOLINA_ROJA)); //jettaGli.setCilindrada(2.0); //Setteamos la cilindrada con el enum Motor
        jettaGli.setTipo(TipoAutomovil.SEDAN);
        System.out.println("--------------------");

        Automovil mazda = new Automovil("Mazda", "Mazda 3", Color.GRIS_MAZDA, new Motor(3.0, TipoMotor.GASOLINA_ROJA));
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        System.out.println("mazda.fabricante -> " + mazda.getFabricante());
        System.out.println("--------------------");
        /*System.out.println("mazda.verDetalle() = " + mazda.verDetalle());
        System.out.println("--------------------");*/

        //Ahora definimos una variable de tipo tipoAutomovil para imprimir toda la info
        TipoAutomovil tipo = jettaGli.getTipo();
        System.out.println("jettaGli Tipo -> " + tipo.getNombre());
        System.out.println("jettaGli numPuertas -> " + tipo.getNumeroPuertas());
        System.out.println("jettaGli Descripción -> " + tipo.getDescripcion());
        System.out.println("--------------------");

        //Implementamos sentencia switch para trabajar con las constantes del enum TipoAutomovil
        tipo = mazda.getTipo();
        switch (tipo){
            case SEDAN ->
                    System.out.println("Auto familiar de tamaño mediano.");
            case HATCHBACK ->
                    System.out.println("Auto familiar de tamaño compacto.");
            case COUPE ->
                    System.out.println("Auto compacto de aspecto deportivo.");
            case PICKUP ->
                    System.out.println("Camioneta con caja, típicamente de trabajo.");
        }
        System.out.println("--------------------");

        //Implementamos un foreach para recorrer todos los valores final del enum
        System.out.println("Recorriendo enum con foreach");
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta: tipos){
            System.out.println(ta + " -> " + ta.name() + ", " +
                    ta.getNombre() + ", " + ta.getNumeroPuertas() + ", " +
                    ta.getDescripcion());
            System.out.println("--------------------\n");
        }
    }
}