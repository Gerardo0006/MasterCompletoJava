public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 8.5F;

        if (promedio >= 8.5){
            System.out.println("Felicitaciones, exceltente promedio!");
        } else if (promedio >= 7.5) {
            System.out.println("Buen promedio");
        } else if (promedio >= 6.5){
            System.out.println("No tienes buen promedio, necesitas esforzarte más :)");
        } else if (promedio < 6.5) {
            System.out.println("Reprobado :(");
        }
    }
}
