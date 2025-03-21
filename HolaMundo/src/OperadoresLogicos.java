public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7F;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i==j && k<l && m==false;
        System.out.println("b1 = " + b1);

        boolean b2 = i==j || k<l;
        System.out.println("b2 = " + b2);

        boolean b3 = i==j && k>l || m==false;
        System.out.println("b3 = " + b3);

        boolean b33 = i==3 && (k<l || m==true);
        System.out.println("b33 = " + b33);

        //Precedencia de los Operadores
        // && tiene prioridad sobre ||. () -> tiene prioridad sobre &&
        boolean b4 = (i==j || k<l) && m==true;
        System.out.println("b4 = " + b4);

        boolean b5 = (true || true) && false;
        System.out.println("b5 = " + b5);

        boolean b6 = true || false  && false || false; //true
        System.out.println("b6 = " + b6);

        boolean b7 = ((true || false) && false) || false; //false
        System.out.println("b7 = " + b7);

    }
}
