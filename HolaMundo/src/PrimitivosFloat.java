public class PrimitivosFloat {

    static float varFlotante;

    public static void main(String[] args) {
        float realFloat1 = 2120F;
        System.out.println("realFloat = " + realFloat1);

        float realFloat2 = 1.5e4F; //15000.0
        System.out.println("realFloat2 = " + realFloat2);

        float realFloat3 = 0.00000000015F; //1.5E-10
        System.out.println("realFloat3 = " + realFloat3);
        System.out.println("------------------------------------------------------------------------");

        System.out.println("realFloat = " + realFloat1);
        System.out.println("Tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor mínimo que se puede asignar a tipo de dato float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo que se puede asignar a tipo de dato float: " + Float.MAX_VALUE);
        System.out.println("------------------------------------------------------------------------");

        //Trabajando con tipo de dato double
        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);

        System.out.println("Tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("Valor mínimo que se puede asignar a tipo de dato double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo que se puede asignar a tipo de dato double: " + Double.MAX_VALUE);
        System.out.println("------------------------------------------------------------------------");

        //Usando var
        var varFlotante1 = 3.1416;
        System.out.println("varFlotante1 = " + varFlotante1);

        var varFlotante2 = 3.1416F;
        System.out.println("varFlotante2 = " + varFlotante2);

        //Valor por defecto de un flotante/float
        //float varFlotante; -> Lo declaramos como método estático fuera del main
        System.out.println("varFlotante = " + varFlotante);
    }
}
