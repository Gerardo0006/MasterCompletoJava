package tareauno.personasdeunacompania;

public class Gerente extends Empleado{
    //Declaración de atributos propios de Empleado
    private double budget;

    //Implementación de métodos constructores
    public Gerente(String name, String lastName, String rfc, String address, double salary, int employeeId){
        super(name, lastName, rfc, address, salary, employeeId);
    }
    public Gerente(String name, String lastName, String rfc, String address, double salary, int employeeId, double budget){
        super(name, lastName, rfc, address, salary, employeeId);
        this.budget = budget;
    }

    //Implementación de método getter
    public double getBudget() {
        return budget;
    }

    //Implementación de método setter para modificar el presupuesto/budget
    public void setBudget(double budget){
        this.budget = budget;
    }

    //Implementación ed sobreescritura del método toString();
    @Override
    public String toString(){
        return super.toString() + "\nPresupuesto mensual: " + budget;
    }
}
