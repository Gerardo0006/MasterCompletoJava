package tareauno.personasdeunacompania;

public class Cliente extends Persona{
    //Declaración de atributos propios de ésta clase
    private int clientId;

    //Implementación de método constructor
    public Cliente(String name, String lastName, String rfc, String address, int clientId){
        super(name, lastName, rfc, address);
        this.clientId = clientId;
    }

    //Implementamos método getter
    public int getClientId(){
        return clientId;
    }

    //Implementación de sobreescritura de método toString();
    @Override
    public String toString(){
        return super.toString() + "\nCliente Id: " + clientId;
    }
}
