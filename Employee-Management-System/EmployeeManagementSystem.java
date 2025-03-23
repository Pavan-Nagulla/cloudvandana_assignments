import java.util.*;

class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee id: "+ id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee salary: "+salary);
        System.out.println("-----------------------------------");
    }

}

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "pavan", 25000);
        Employee emp2 = new Employee(2, "kalyan", 58000);
        Employee emp3 = new Employee(3, "ram", 47000);


        List<Employee> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);


        for(Employee employee: employees){
            employee.displayDetails();
        }
        
    }
    
}
