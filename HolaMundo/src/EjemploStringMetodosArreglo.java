public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo1 = trabalenguas.toCharArray();
//        System.out.println("arreglo = " + arreglo);
        int largo = arreglo1.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++){
            System.out.println("arreglo1 = " + arreglo1[i]);
        }
        for (int i = 0; i < largo; i++){
            System.out.print(arreglo1[i]);
        }
        System.out.println();

        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
        String[] arreglo2 = trabalenguas.split("a");
        int largo2 = arreglo2.length;
        System.out.println("largo2 = " + largo2);
        for(int j=0; j<largo2; j++){
            System.out.println(arreglo2[j]);
        }
    }
}
