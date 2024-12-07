import java.util.ArrayList;
import java.util.List;

public class Team extends EmployeeComponent{

    private String teamName;

    private List<EmployeeComponent> members;

    Team(String teamName){
        this.teamName = teamName;
        members = new ArrayList<>();
    }

    public void addMembers(EmployeeComponent employeeComponent){
        members.add(employeeComponent);
    }

    @Override
    public void display() {
        System.out.println("Team: "+teamName);
        for (EmployeeComponent employeeComponent : members){
            employeeComponent.display();
        }
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0;
        for (EmployeeComponent employeeComponent: members){
            totalSalary+=employeeComponent.calculateSalary();
        }
        return totalSalary;
    }
}
