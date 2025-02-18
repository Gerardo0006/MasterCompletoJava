package tareauno.personasdeunacompania;

public class Persona {
    //Declaramos los atributos de la clase Persona
    private String name;
    private String lastName;
    private String rfc;
    private String address;

    //Implementación de método Constructor
    public Persona(String name, String lastName, String rfc, String address) {
        this.name = name;
        this.lastName = lastName;
        this.rfc = rfc;
        this.address = address;
    }

    //Implementación de métodos getter
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getRfc() {
        return rfc;
    }
    public String getAddress() {
        return address;
    }

    //Implementamos la sobreescritura del método toString();
    @Override
    public String toString() {
        return "Nombre: " + name +
                "\nApellido: " + lastName +
                "\nRFC: " + rfc +
                "\nDirección: " + address;
    }
}
