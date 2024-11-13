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

        //Definimos valores para los atributos de los objetos
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.color = "Azúl metálico";
        subaru.cilindrada = 2.0;

        mazda.fabricante = "Mazda";
        mazda.modelo = "Mazda 3 Sedán";
        mazda.color = "Cereza"; //Si lo comentamos para que tome el valor por defecto (gris)
        mazda.cilindrada = 2.0;

        //Imprimimos los valores de los objetos
        System.out.println(subaru.detalle()); //Nombre del objeto seguido de punto, seguido de detalle
        System.out.println();
        System.out.println(mazda.detalle());

    }
}
