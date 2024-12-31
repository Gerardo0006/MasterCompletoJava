public class EjemploAutomovil1 {
    public static void main(String[] args) {
        //Declaramos/Definimos/Inicializamos los objetos
        Automovil1 subaru = new Automovil1();
        //Definimos los atributos de el objeto Subaru
        subaru.fabricante = "Subaru";
        subaru.modelo = "Impreza";
        subaru.cilindrada = 2.0;
        subaru.color = "Azúl metálico";

        Automovil1 mazda = new Automovil1();
        //Definimos los atributos del objeto Mazda
        mazda.fabricante = "Mazda";
        mazda.modelo = "Mazda 3";
        mazda.cilindrada = 2.0;
        mazda.color = "Gris polimetal";

        //Imprimimos el Objetos subaru
        System.out.println("subaru.fabricante -> " + subaru.fabricante);
        System.out.println("subaru.modelo -> " + subaru.modelo);
        System.out.println("subaru.cilindrada -> " + subaru.cilindrada);
        System.out.println("subaru.color -> " + subaru.color);

        //Imprimimos el Objetos mazda
        System.out.println("mazda.fabricante -> " + mazda.fabricante);
        System.out.println("mazda.modelo -> " + mazda.modelo);
        System.out.println("mazda.cilindrada -> " + mazda.cilindrada);
        System.out.println("mazda.color -> " + mazda.color);
    }
}
