import java.util.*;

class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.1; // Base bonus is 10% of the salary
    }

    public void generatePerformanceReport() {
        System.out.println("Performance Report for " + jobTitle + ": " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }

    public void manageProjects() {
        System.out.println(name + " is managing a generic project.");
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2; // Managers get 20% bonus
    }

    @Override
    public void manageProjects() {
        System.out.println(name + " is managing multiple projects and leading a team.");
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public void manageProjects() {
        System.out.println(name + " is managing the development of a software project.");
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public void manageProjects() {
        System.out.println(name + " is managing programming tasks within a project.");
    }
}

public class Company {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter employee type (Manager/Developer/Programmer): ");
        String type = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Employee employee;

        switch (type.toLowerCase()) {
            case "manager":
                employee = new Manager(name, address, salary);
                break;
            case "developer":
                employee = new Developer(name, address, salary);
                break;
            case "programmer":
                employee = new Programmer(name, address, salary);
                break;
            default:
                System.out.println("Invalid employee type! Defaulting to base Employee.");
                employee = new Employee(name, address, salary, "Employee");
        }

        System.out.println("\n--- Performance Report ---");
        employee.generatePerformanceReport();

        System.out.println("\n--- Project Management ---");
        employee.manageProjects();
    }
}
