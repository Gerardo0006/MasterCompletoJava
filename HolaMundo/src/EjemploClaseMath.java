public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.5);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        System.out.println("------------------------");

        //Funciones trigonométricas
        double exp = Math.exp(2); //Calcular el exponente
        System.out.println("exp = " + exp);

        double log = Math.log(10); //Recibe un long y calcula el logaritmo de ese long
        System.out.println("log = " + log);

        double potencia = Math.pow(2, 3); //Recibe dos doubles, base y potencia
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(4); //Recibe un double para calcular su raíz cuadrada
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57); //Recibe un double que corresponde a los radianes para calcular su equivalente en grados
        grados = Math.round(grados);
        System.out.println("Convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00); //Recibe un double que corresponde a los grados para calcular su equivalencia en radianes
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90°) =  " + Math.sin(radianes)); //Recibe un double que corresponde a los radianes para calcular Seno
        System.out.println("cos(90°) = " + Math.cos(radianes)); //Recibe un double que corresponde a los radianes para calcular Coseno

        radianes = Math.toRadians(100.00);
        System.out.println("cos(180°) = " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("sin(180°) = " + Math.sin(radianes));
    }
}
