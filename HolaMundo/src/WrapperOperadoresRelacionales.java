public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        //Comparamos los objetos por referencia
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("¿Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("¿Son el mismo objeto? " + (num1 == num2));

        //Comparamos los objetos por valor
        System.out.println("¿Los objetos tienen el mismo valor? " + (num1.equals(num2)));

        //Comparando valores con Unboxing (pasando de clase Wrapper a primitivo cada objeto)
        System.out.println("¿Los objetos tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

        num2 = 500;
        boolean condicion = num1.intValue() > num2.intValue();
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1 < num2;
        System.out.println("condicion2 = " + condicion2);
    }
}
