public class EjemploStringTestRendimiento {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a; //c es igual al objeto a, es un valor por referencia

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i=0; i<10000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //10000 -> 85ms
            //c += a + b + "\n"; //10000 -> 49ms
            sb.append(a).append(b).append("\n"); //10000 -> 2ms
//            sb.append(a);
//            sb.append(b);
//            sb.append("\n");
        }

        long fin = System.currentTimeMillis();

        System.out.println(fin-inicio + " ms");
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}