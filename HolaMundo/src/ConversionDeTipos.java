public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        System.out.println("------------------------------------------------------------------------");

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        //Otra manera de convertir tipo de dato primitivo (int) a String
        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        //Otra manera de convertir tipo de dato primitivo (double) a String
        otroRealStr = String.valueOf(1.23456e2);
        System.out.println("otroRealStr = " + otroRealStr);

        System.out.println("------------------------------------------------------------------------");

        //Conversión entre datos primitivos
        int i = 22768;
        //short s = i; //Si lo dejamos indicado así nos marcaría error ya que el valor de i es demasiado grande para almacenar en short (sin forzar), para guardar i en s debemos hacer uso de Cast que viene siendo forzar a s para que almacene el valor de i
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println("El valor máximo de un tipo de dato short es " + Short.MAX_VALUE);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
