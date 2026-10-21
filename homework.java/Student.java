class Student {
    // Variables
    String name;
    int rollNumber;
    double marks;

    // Default constructor
    Student() {
        name = "Not Assigned";
        rollNumber = 0;
        marks = 0.0;
    }

    // Parameterized constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Display method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Object using default constructor
        Student s1 = new Student();

        // Object using parameterized constructor
        Student s2 = new Student("John", 101, 89.5);

        // Display details
        s1.displayInfo();
        s2.displayInfo();
    }
}