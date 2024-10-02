public class WrapperBoolean {
    public static void main(String[] args) {

        //Creamos dos instancias de tipo Integer y les asignamos valor
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primitivoBoolean = num1 > num2; //false
        Boolean objBoolean1 = Boolean.valueOf(primitivoBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;

        System.out.println("primitivoBoolean = " + primitivoBoolean);
        System.out.println("objBoolean1 = " + objBoolean1);
        System.out.println("objBoolean2 = " + objBoolean2);
        System.out.println("objBoolean3 = " + objBoolean3);

        //Comparando dos objetos Boolean (La clase Boolean se compara por valor, no por instancia/objeto/referencia)
        System.out.println("Comparando dos objetos boolean: " + (objBoolean1 == objBoolean2));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean1.equals(objBoolean2)));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean2 == objBoolean3));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean1 == objBoolean3));

        boolean primitivoBoolean2 = objBoolean2.booleanValue();
        System.out.println("primitivoBoolean2 = " + primitivoBoolean2);
    }
}
