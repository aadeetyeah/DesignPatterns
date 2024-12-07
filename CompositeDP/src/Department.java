import java.util.ArrayList;
import java.util.List;

public class Department extends EmployeeComponent{

    private String name;

    private List<EmployeeComponent> members;

    Department(String name){
        this.name = name;
        members = new ArrayList<>();
    }

    public void addMember(EmployeeComponent employeeComponent){
        members.add(employeeComponent);
    }

    @Override
    public void display() {
        System.out.println("Department: "+name);
        for (EmployeeComponent employeeComponent : members){
            employeeComponent.display();
        }
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0;
        for(EmployeeComponent employeeComponent : members){
            totalSalary+=employeeComponent.calculateSalary();
        }
        return totalSalary;
    }
}
