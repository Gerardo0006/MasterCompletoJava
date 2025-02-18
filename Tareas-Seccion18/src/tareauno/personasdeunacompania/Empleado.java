package tareauno.personasdeunacompania;

public class Empleado extends Persona{
    //Declaración de atributos propios de ésta clase
    private double salary;
    private int employeeId;

    //Implementación de Método Constructor
    public Empleado (String name, String lastName, String rfc, String address, double salary, int employeeId){
        super(name, lastName, rfc, address);
        this.salary = salary;
        this.employeeId = employeeId;
    }

    //Implementación de métodos getter
    public double getSalary() {
        return salary;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    //Implementación de método para incrementar el salario
    public void increaseSalary(double percentage) {
        salary += (salary * percentage/100);
    }

    //Implementación de sobreescritura de método toString();
    @Override
    public String toString(){
        return super.toString() + "\nId: " + employeeId
                + "\nSalario: " + this.salary;
    }
}
