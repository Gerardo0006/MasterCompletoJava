
public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
        //Declaramos/instanciamos los objetos
        //Declaramos la instancia de ruedas para jettaGli
        Rueda[] ruedasJetta = new Rueda[5];
        //Optmimización de código, llenamos el array ruedas con un for
        /*ruedasJetta[0] = new Rueda("Yokohama", 17, 7.5);
        ruedasJetta[1] = new Rueda("Yokohama", 17, 7.5);
        ruedasJetta[2] = new Rueda("Yokohama", 17, 7.5);
        ruedasJetta[3] = new Rueda("Yokohama", 17, 7.5);
        ruedasJetta[4] = new Rueda("Yokohama", 17, 7.5);*/
        for (int i=0; i<ruedasJetta.length; i++){
            ruedasJetta[i] = new Rueda("Yokohama", 17, 7.5);
        }

        //Asignando valores a los atributos fabricante y modelo a través del método constructor
        Automovil jettaGli = new Automovil("Volkswagen", "Jetta GLI");
        //Asignamos el tipo de motor haciendo uso del enum TipoMotor y el objeto Motor
        jettaGli.setMotor(new Motor(2.0, TipoMotor.GASOLINA_ROJA));
        //Asignamos el color con enum
        jettaGli.setColor(Color.NEGRO);
        //Asignamos el tipo de auto con enum TipoAutomovil y método set del objeto jettaGli
        jettaGli.setTipo(TipoAutomovil.SEDAN);
        //Declaro una instancia de Persona para asignar conductor a jettaGli
        Persona conductorJetta = new Persona("Gerardo", "Macías");
        //Asignamos conductorJetta a jettaGli
        jettaGli.setConductor(conductorJetta);
        //Asignamos las ruedas de jettaGli
        jettaGli.setRuedas(ruedasJetta);

        //Declaramos la instancia de ruedas para mazda
        //Optmimización de código, llenamos el array ruedas con un for
        /*Rueda[] ruedasMazda = {new Rueda("Michelin", 16, 6.5),
                new Rueda("Michelin", 16, 6.5),
                new Rueda("Michelin", 16, 6.5),
                new Rueda("Michelin", 16, 6.5),
                new Rueda("Michelin", 16, 6.5),
        };*/
        Rueda[] ruedasMazda = new Rueda[5];
        for (int i=0; i<ruedasMazda.length; i++){
            ruedasMazda[i] = new Rueda("Michelin", 16, 6.5);
        }
        //Declaro una instancia de Persona para asignar conductor a Mazda
        Persona conductorMazda = new Persona("Rolando", "Macías");
        //Declaramos la instancia del objeto mazda pasándole 4 parámetro/argumentos a su constructor
        Automovil mazda = new Automovil("Mazda", "Mazda 3", Color.GRIS_MAZDA, new Motor(2.5, TipoMotor.GASOLINA_ROJA));
        //Asignamos el tipo de vehículo con el método setTipo del objeto mazda
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        //Asignamos capacidad el tanque de gasolina con el método setTanque del objeto mazda con la instancia del objeto Tanque(sin parámetros)
        mazda.setTanque(new Tanque());
        //Asignamos conductorJetta a mazda
        mazda.setConductor(conductorMazda);
        //Setteamos las ruedas de mazda
        mazda.setRuedas(ruedasMazda);

        //Declaramos la instancia de ruedas para honda
        //Optmimización de código, llenamos el array ruedas con un for
        /*Rueda[] ruedasHonda = {new Rueda("Pirelli", 17, 6.5),
                new Rueda("Pirelli", 17, 6.5),
                new Rueda("Pirelli", 17, 6.5),
                new Rueda("Pirelli", 17, 6.5),
                new Rueda("Pirelli", 17, 6.5),
        };*/
        Rueda[] ruedasHonda = new Rueda[5];
        for (int i = 0; i<ruedasHonda.length; i++){
            ruedasHonda[i] = new Rueda("Pirelli", 17, 6.5);
        }

        //Declaro una instancia de Persona para asignar conductor a honda
        Persona conductorHonda = new Persona("Karina", "Macías");
        //Creamos otra instancia del tipo Automovil llamada honda pasándole 7 parámetros a su método constructor (incluido el conductor)
        Automovil honda = new Automovil("Honda", "Civic", Color.GRIS_HONDA, new Motor(2.0, TipoMotor.GASOLINA_ROJA), new Tanque(50), conductorHonda, null);
        //Asignamos el tipo de vehículo con el método setTipo
        honda.setTipo(TipoAutomovil.SEDAN);
        //Setteamos las ruedas de honda
        honda.setRuedas(ruedasHonda);

        //Declaramos la instancia de ruedas para hondaTypeR
        //Optmimización de código, llenamos el array ruedas con un for
        Rueda[] ruedasHondaTypeR = new Rueda[5];
        /*ruedasJetta[0] = new Rueda("Pirelli", 17, 7.0);
        ruedasJetta[1] = new Rueda("Pirelli", 17, 7.0);
        ruedasJetta[2] = new Rueda("Pirelli", 17, 7.0);
        ruedasJetta[3] = new Rueda("Pirelli", 17, 7.0);
        ruedasJetta[4] = new Rueda("Pirelli", 17, 7.0);*/
        for (int i=0; i<ruedasHondaTypeR.length; i++){
            ruedasHondaTypeR[i] = new Rueda("Pirelli", 17, 7.0);
        }

        //Declaro una instancia de Persona para asignar conductor a hondaTypeR
        Persona conductorHondaTypeR = new Persona("Fátima", "Ramos");
        Automovil hondaTypeR = new Automovil("Honda", "Civic Type R", Color.GRIS_MAZDA, new Motor(2.0, TipoMotor.GASOLINA_ROJA), new Tanque(50), conductorHondaTypeR, null);
        hondaTypeR.setTipo(TipoAutomovil.COUPE);
        //Setteamos las ruedas de hondaTypeR
        hondaTypeR.setRuedas(ruedasHondaTypeR);

        //Creamos otra instancia sin valores para agregar validaciones de null en la sobreescritura de equals
        Automovil auto = new Automovil();

        //Modificamos el atributo estático colorPatente
        //Automovil.setColorPatente(Color.COLOR_PATENTE);

        System.out.println("VER DETALLE\n");
        System.out.println(jettaGli.verDetalle());
        System.out.println("----------------------");
        System.out.println(mazda.verDetalle());
        System.out.println("----------------------");
        System.out.println(honda.verDetalle());
        System.out.println("----------------------");
        System.out.println(hondaTypeR.verDetalle());
        System.out.println("----------------------");
        System.out.println();
        /*System.out.println(jettaGli.toString());
        System.out.println("----------------------");
        System.out.println(mazda.toString());
        System.out.println("----------------------");
        System.out.println(honda.toString());
        System.out.println("----------------------");*/

        //Imprimimos la info de

    }
}
