public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo1 = 32768; //Tipo int primitivo con valor asignado
        int intPrimitivo2 = 30024; //Tipo int primitivo con valor asignado
        Integer intObjeto1 = Integer.valueOf(intPrimitivo1); //Instanciando Objeto de la clase Wrapper Integer de forma explícita
        Integer intObjeto2 = intPrimitivo2; //Instanciando Objeto de la clase Wrapper Integer de forma implícita

        System.out.println("intObjeto1 = " + intObjeto1);
        System.out.println("intObjeto2 = " + intObjeto2);

        int num1 = intObjeto1; //Asignando el valor del objeto a una variable primitiva de forma implícita
        int num2 = intObjeto2.intValue(); //Asignando el valor del objeto a una variable primitiva de forma explícita

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        String valorTvLcd = "12000";
        Integer intValorTvLcd = Integer.valueOf(valorTvLcd);
        System.out.println("intValorTvLcd = " + intValorTvLcd);
    }
}
