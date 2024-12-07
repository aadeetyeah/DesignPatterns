//Leaf class/object
public class Employee extends EmployeeComponent {

    private String name;

    private double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employe: " + name+" Salary: "+salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
