class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Gerardo");

        System.out.println("Iniciamos el método Main");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("Iniciamos el método test");
        test(persona);
        System.out.println("Después de llamar al método test");

        System.out.println("persona = " + persona.leerNombre());

        System.out.println("Finaliza el método main con los datos de la persona modificados");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Gerry");
        System.out.println("Finaliza el método test");
    }
}
