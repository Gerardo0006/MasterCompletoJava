import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        double random = Math.random(); //Genera un número aleatorio entre 0-1 (nunca es cero y nuca es 1)
        System.out.println("random = " + random);

        random *= colores.length;

        System.out.println("random = " + random);

        random = Math.ceil(random);
        System.out.println("randomCeil = " + random);

        random = Math.floor(random);
        System.out.println("randomFloor = " + random);

        random = Math.round(random);
        System.out.println("randomRound = " + random);

        //Imprmimimos un color aleatorio
        System.out.println("Color: " + colores[(int) random]); //Al poner (int) estamos aplicando Cast para convertir double a int

        System.out.println("------------------------------------");

        //Método Random
        Random randomObj = new Random(); //Instanciamos el objeto de la clase/método Random
        int randomInt = 15 + randomObj.nextInt(25-15+1); //Generamos un número aleatorio  con el método .nextInt();
        // 15 -> Límite inferior. 25-15+1 -> 25=Límite superior 15=Límite inferior 1=Indicamos que incluya el 25
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}
