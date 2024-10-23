public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        //Poblamos el array
        for (int i=0; i<numeros.length; i++){
            numeros[i] = i+1;
        }

        //Imprimimos los valores del array con el orden 1-10, 2-9, ..., 5-6
        for (int i = 0; i<numeros.length/2; i++){
            System.out.println("numeros[" + i + "],[" + (numeros.length-1-i) + "] -> [" + numeros[i] + "],[" + numeros[numeros.length-1-i] + "]");
        }

        System.out.println("------------------------");

        //Trabajando con otro array
        int[] a = new int[10];
        int aux = 0;
        //Asignamos valores al array a
        for (int i = 0; i<numeros.length-i; i++){
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length-1-i];
        }
        //Imprimimos el array a
        for (int i=0; i<a.length; i++){
            System.out.println("a[" + i + "] -> " + a[i]);
        }
    }
}
