abstract class Employee {
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
    private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(int id, String name, int hours, double rate) {
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
        FullTimeEmployee f = new FullTimeEmployee(101, "Kamal", 80000);
        PartTimeEmployee p = new PartTimeEmployee(102, "Nimal", 20, 1500);

        f.displayDetails();
        System.out.println();

        p.displayDetails();
    }
}