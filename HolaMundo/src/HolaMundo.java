public class HolaMundo {
    public static void main(String[] args) {

        //Declaramos una variable de tipo string para almacenar "Hola Mundo!"
        String saludo = "Hola Mundo!";
        System.out.println(saludo);
        
        //Ahora convertimos el string a Mayúsculas
        System.out.println("saludo.toUpperCase() = " + saludo.toUpperCase());

        //Trabajando con int e Integer
        int num1 = 11; //Tipo de dato Primitivo
        //Integer num2 = 20; //Tipo de dato Objeto
        System.out.println("num1 = " + num1);

        //Trabajando con Boolean
        boolean valor = true;
        int num3 = 5;
        if(valor){
            System.out.println("num1 = " + num1);
            num3 = 10;
        }
        System.out.println("num3 = " + num3);

        //Usando var para declarar variables
        var num4 = 24;
        var num5 = "19";
        
        String nombre;
        nombre = "Gerardo";
        if(num1 > 10){
            nombre = "Gerry";
        }
        System.out.println("nombre = " + nombre);
    }
}
