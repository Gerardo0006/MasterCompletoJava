public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {

        if (args.length != 3){
            System.err.println("Por favor ingresa una operación (suma, resta, mult, div) " +
                    "y los dos valores enteros (a y b) para calcular el resultado");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;

        //Manejo de errores/excepciones
        try{
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch(NumberFormatException e){
            System.err.println("Cuidado!\n'a' y 'b' deben ser enteros, vuelve a intentarlo");
            System.exit(-1);
        }

        switch (operacion){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "mult":
                resultado = a*b;
                break;
            case "div":
                if (b == 0){
                    System.out.println("No se puede dividir por cero!");
                    System.exit(-1);
                }
                resultado = (double) a/b;
                break;
            default:
                System.err.println("Debe ingresar argumentos o parámetros!");
        }
        System.out.println("El resultado de la operación es: " + operacion + "= " + resultado);
    }
}
