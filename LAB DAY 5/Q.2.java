public abstract class Employee {
    private int employeeId;
    private String name;

    Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    abstract double calculateSalary();
    abstract void displayDetails();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name);
        monthlySalary = salary;
    }

    double calculateSalary() {
        return monthlySalary;
    }

    void displayDetails() {
        System.out.println("ID: " + getEmployeeId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + calculateSalary());
    }
}

class PartTimeEmployee extends Employee {
    private double hoursWorked, hourlyRate;

    PartTimeEmployee(int id, String name, double hours, double rate) {
        super(id, name);
        hoursWorked = hours;
        hourlyRate = rate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    void displayDetails() {
        System.out.println("ID: " + getEmployeeId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "John", 50000);
        Employee e2 = new PartTimeEmployee(102, "Peter", 80, 500);

        e1.displayDetails();
        System.out.println();

        e2.displayDetails();
    }
} {
    
}
