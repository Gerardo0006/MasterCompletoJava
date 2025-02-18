package tareauno.personasdeunacompania;

public class Main {
    public static void main(String[] args) {
        //Creamos instancia del tipo Gerente pasándole valores por argumento/parámetro
        Gerente gerente = new Gerente("Gerardo", "Macías",
                "MAMG000621HASCRRA1", "Bahía de Acapulco, #143",
                25000, 10);
        gerente.setBudget(100000);

        Empleado empleado = new Empleado("Jesús", "Ramírez",
                "ITRZ661127MOCKGU92", "Sierra Fría, #213", 8000, 6);

        Cliente cliente = new Cliente("Liz", "Vargas",
                "LWZE810404HMSDCT11", "San Agustín, #309", 199);

        //Invocamos la función imprimir
        Imprimir(gerente);
        Imprimir(empleado);
        Imprimir(cliente);

    }

    //Implementando función/método que imprima
    public static void Imprimir(Persona persona){
        System.out.println("Imprimiendo los datos de la clase padre 'Persona'");
        System.out.println("Nombre: " + persona.getName() +
                "\nApellido: " + persona.getLastName() +
                "\nRFC: " + persona.getRfc() +
                "\nDirección: " + persona.getAddress());
        if(persona instanceof Empleado){
            System.out.println("Imprimiendo info de Empleado:");
            System.out.println("Salario: " + ((Empleado) persona).getSalary() +
                    "\nId de empleado: " + ((Empleado) persona).getEmployeeId());
            //Validamos si empleado es Gerente
            if (persona instanceof Gerente){
                System.out.println("Imprimiendo la info de Gerente:");
                System.out.println("Presupuesto: " + ((Gerente) persona).getBudget());
            }
            System.out.println("--------------------");
        }
        if(persona instanceof Cliente){
            System.out.println("Imprimiendo la info de Cliente:");
            System.out.println("Id de cliente: " + ((Cliente) persona).getClientId());
            System.out.println("--------------------");
        }
    }
}
