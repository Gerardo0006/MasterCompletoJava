public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {
        //bucle1: Esta es una etiqueta de bucle

        bucle1: for (int i=0; i<5; i++){
            System.out.println();
            for (int j=0; j<5; j++){
                if (i == 2){
                    continue bucle1; //Omite la iteración pero sólo en el primer for, el que tenemos etiquetado como bucle1
                }
                System.out.print("[i= " + i + ", j= " + j + "] ");
            }
        }

        System.out.println("\n\n-------------------------------------------------");

        etiqueta: for (int i=0; i<5; i++){
            System.out.println();
            for (int j=0; j<5; j++){
                if (i == 2){
                    break etiqueta; //Rompe la ejecución pero sólo en el primer for, el que tenemos etiquetado como bucle1
                }
                System.out.print("[i= " + i + ", j= " + j + "] ");
            }
        }
    }
}
