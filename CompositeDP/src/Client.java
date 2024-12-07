public class Client {
    public static void main(String[] args) {
        EmployeeComponent aditya = new Employee("Aditya",2120);
        EmployeeComponent samridhi = new Employee("Samridhi",3130);

        Team enggTeam = new Team("Legion");
        enggTeam.addMembers(samridhi);
        enggTeam.addMembers(aditya);

        Department delivery = new Department("Delivery");
        delivery.addMember(enggTeam);

        delivery.display();
        System.out.println("Total salary of department delivery: "+ delivery.calculateSalary());
    }
}
