public class EjemploAutomovil {
    public static void main(String[] args) {
        /*
        //Instanciamos objeto
        Automovil subaru = new Automovil();

        //Setteamos los valores de los atributos
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.color = "Azúl metálico";
        subaru.cilindrada = 2.0;

        //Imprimimos los valores del objeto subaru llamando al Método detalle
        subaru.detalle(); //Nombre del objeto seguido de punto, seguido de detalle

        System.out.println();

        //Creamos otro objeto
        Automovil mazda = new Automovil();
        
        mazda.fabricante = "Mazda";
        mazda.modelo = "Mazda 3 Sedán";
//        mazda.color = "Cereza"; //Comentado para que tome el valor por defecto (gris)
        mazda.cilindrada = 2.0;

        //Imprimimos los valores del objeto subaru llamando al Método detalle
        mazda.detalle();

         */

        //Instanciamos objetos
        Automovil subaru = new Automovil();
        Automovil mazda = new Automovil();

        /*//Definimos valores para los atributos de los objetos
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.color = "Azúl metálico";
        subaru.cilindrada = 2.0;

        mazda.fabricante = "Mazda";
        mazda.modelo = "Mazda 3 Sedán";
        mazda.color = "Cereza"; //Si lo comentamos para que tome el valor por defecto (gris)
        mazda.cilindrada = 2.0;*/

        //Definimos los atributos de cada objeto a través de sus métodos SET
        subaru.asignarFabricante("Subaru");
        subaru.asignarModelo("Impreza");
        subaru.asignarColor("Azúl Metálico");
        subaru.asignarCilindrada(3.0);

        mazda.asignarFabricante("Mazda");
        mazda.asignarModelo("Mazda 3 Hatchback");
        mazda.asignarColor("Gris Rata");
        mazda.asignarCilindrada(3.0);

        //Imprimimos los valores de los objetos
        System.out.println(subaru.verDetalle()); //Nombre del objeto seguido de punto, seguido de detalle
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println();
        System.out.println("Método Acelerar");
        System.out.println(subaru.acelerar(3000));
        System.out.println("Método Frenar");
        System.out.println(subaru.frenar());
        System.out.println("Método Acelerar");
        System.out.println(mazda.acelerar(3500));
        System.out.println("Método Frenar");
        System.out.println(mazda.frenar());
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Método acelerarFrenar");
        System.out.println(subaru.acelerarFrenar(3000));
        System.out.println();
        System.out.println(mazda.acelerarFrenar(3000));
        System.out.println();

        //Imprimimos valores del nuevo método
        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300, 0.5f));
        //Imprimimos valores con la sobrecarga de métodos
        System.out.println("Kilómetros por litro: " + subaru.calcularConsumo(300, 60));
    }
}
