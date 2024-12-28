
public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.COUPE);

        Automovil mazda = new Automovil("Mazda", "Mazda 3", Color.GRIS, 3.0);
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("\ntipoSubaru.getNombre -> " + tipo.getNombre());
        System.out.println("tipoSubaru.getDescripcion -> " + tipo.getDescripcion());

        //Agregamos switch case
        tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo, descapotable y de dos puertas");
            break;
            case COUPE:
                System.out.println("El automovil es pequeño, de dos puertas y normalmente deportivo");
            break;
            case FURGON:
                System.out.println("El automovil es utilitario, de transporte, tipicamente de empresas.");
            break;
            case HATCHBACK:
                System.out.println("El automovil es mediano compacto, con aspecto deportivo");
            break;
            case PICKUP:
                System.out.println("El automovil es de doble cabina o camioneta de carga");
            break;
            case SEDAN:
                System.out.println("El automovil es mediano, tipicamente familiar");
            break;
            case STATION_WAGON:
                System.out.println("El automovil es grande, puede ser una camioneta de viaje");
            break;
        }
        //De Java 13 en adelante se puede usar el Switch Case mejorado (Con flecha y sin break)
        /*switch (tipo){
            case CONVERTIBLE ->
                System.out.println("El automovil es deportivo, descapotable y de dos puertas");
            case COUPE ->
                System.out.println("El automovil es pequeño, de dos puertas y normalmente deportivo");
            case FURGON ->
                System.out.println("El automovil es utilitario, de transporte, tipicamente de empresas.");
            case HATCHBACK ->
                System.out.println("El automovil es mediano compacto, con aspecto deportivo");
            case PICKUP ->
                System.out.println("El automovil es de doble cabina o camioneta de carga");
            case SEDAN ->
                System.out.println("El automovil es mediano, tipicamente familiar");
            case STATION_WAGON ->
                System.out.println("El automovil es grande, puede ser una camioneta de viaje");
        }*/

        //Declaramos un array del tipo Automovil
        TipoAutomovil[] tipos = TipoAutomovil.values();
        //Recorremos el array con un bucle foreach
        for (TipoAutomovil tipo_automovil : tipos){
            System.out.println(tipo_automovil + " -> " + tipo_automovil.name() + ", " +
                    tipo_automovil.getNombre() + ", " + tipo_automovil.getDescripcion() + ", " +
                    tipo_automovil.getNumeroPuertas());
            System.out.println();
        }
    }

}
