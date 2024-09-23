public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "trigo tres trigo tristes tigres tragaban trigo en un trigal trigo";
        /*int max = frase.length();
        int cantidad = 0;

        for (int i=0; i<max; i++){
            if (frase.charAt(i) != 't'){
                continue;
            }
            cantidad++;
        }
        System.out.println("Se encontró [" + cantidad + "] veces el caratcer \"t\" ");*/

        /*Ejemplo para buscar palabras en la cadena*/
        String palabra = "trigo";
        int cantidad = 0;
        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        buscar: //Etiqueta del primer bucle (Al primer for lo vamos a identificar con la palabra/etiqueta buscar)
        for (int i=0; i<=maxFrase;){
            int k = i;
            for (int j=0; j<maxPalabra; j++){
                if (frase.charAt(k++) != palabra.charAt(j)){
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Se encontró [" + cantidad + "] veces la palabra \"trigo\"");
    }
}
