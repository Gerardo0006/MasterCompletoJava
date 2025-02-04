public class Persona {
    private String nombre;
    private String apellido;

    //Implementamos método constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //IMplementamos sobreescritura de método toString
    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
