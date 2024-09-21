public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datoLogico1 = false;
        boolean datoLogico2 = true;

        System.out.println("datoLogico1 = " + datoLogico1);
        System.out.println("datoLogico2 = " + datoLogico2);
        System.out.println("------------------------------------------------------------------------");

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);

        float f = 1.2345e2F; // 123.45
        System.out.println("f = " + f);

        datoLogico = d>f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
