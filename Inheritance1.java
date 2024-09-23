import java.util.*;
class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 50000.0; // Example salary
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is managing employees.");
    }

    public void addEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        // Create a new Employee object and add it to a list or database
        Employee newEmployee = new Employee();
        // ... add newEmployee to your employee management system
        System.out.println("Employee " + name + " added successfully.");
    }
}

 class Inheritance1{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();
        System.out.println("Salary: " + employee.getSalary());

        HRManager hrManager = new HRManager();
        hrManager.work();
        System.out.println("Salary: " + hrManager.getSalary());

        hrManager.addEmployee();
    }
}
