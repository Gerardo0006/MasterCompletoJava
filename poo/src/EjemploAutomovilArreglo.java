import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Automovil jettaGli = new Automovil("Volkswagen", "Jetta GLI");
        jettaGli.setMotor(new Motor(2.0, TipoMotor.GASOLINA_ROJA));
        jettaGli.setColor(Color.NEGRO);
        jettaGli.setTipo(TipoAutomovil.SEDAN);
        Persona conductorJetta = new Persona("Gerardo", "Macías");
        jettaGli.setConductor(conductorJetta);

        Persona conductorMazda = new Persona("Rolando", "Macías");
        Automovil mazda = new Automovil("Mazda", "Mazda 3", Color.GRIS_MAZDA, new Motor(2.5, TipoMotor.GASOLINA_ROJA));
        mazda.setTipo(TipoAutomovil.HATCHBACK);
        mazda.setTanque(new Tanque());
        mazda.setConductor(conductorMazda);

        Persona conductorHonda = new Persona("Karina", "Macías");
        Automovil honda = new Automovil("Honda", "Civic", Color.GRIS_HONDA, new Motor(2.0, TipoMotor.GASOLINA_ROJA), new Tanque(50), conductorHonda, null);
        honda.setTipo(TipoAutomovil.SEDAN);

        Persona conductorHondaTypeR = new Persona("Fátima", "Ramos");
        Automovil hondaTypeR = new Automovil("Honda", "Civic Type R", Color.GRIS_MAZDA, new Motor(2.0, TipoMotor.GASOLINA_ROJA), new Tanque(50), conductorHondaTypeR, null);
        hondaTypeR.setTipo(TipoAutomovil.COUPE);

        Automovil auto = new Automovil();

        //Creamos el array de objetos
        Automovil[] autos = new Automovil[4];
        //Inicializo cada índice del array con un objeto
        autos[0] = jettaGli;
        autos[1] = mazda;
        autos[2] = honda;
        autos[3] = hondaTypeR;

        //Ordenamos el array con el método sort
        Arrays.sort(autos);
        //Imprimimos el array de objetos
        for (int i=0; i<autos.length; i++){
            System.out.println(autos[i]);
        }

    }
}