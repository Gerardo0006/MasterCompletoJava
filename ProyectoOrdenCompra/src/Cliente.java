public class Cliente {
    //Definimos/declaramos los atributos
    private String nombre;
    private String apellido;

    //Implementamos método constructor que inicializa los atributos
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Implementación de métodos getter
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    //Implementamos la sobreescritura del método toString para que se pueda imprimir el
    // valor real del nombre y no el valor que genera la JVm
    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}
