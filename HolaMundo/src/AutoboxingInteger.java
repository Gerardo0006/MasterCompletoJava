public class AutoboxingInteger {
    public static void main(String[] args) {

        //Declaramos un arreglo de la clase Integer
        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int suma = 0;
        for (Integer i: enteros){
            //Calculando de forma explícita
            if (i.intValue() % 2 == 0){
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);

        System.out.println("----------------------------------");

        suma = 0;
        for (Integer i: enteros){
            //Calculando de forma implícita
            if (i % 2 == 0){
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
