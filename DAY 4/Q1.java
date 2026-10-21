class Student {
    String name;
    int rollNumber;
    double marks;

    Student() {
        name = "Not Assigned";
        rollNumber = 0;
        marks = 0.0;
    }

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("");
    }

    public static void main(String[] args) {
        // Object using default constructor
        Student s1 = new Student();
     Student s2 = new Student("pemitha", 101, 89.5);

        s1.displayInfo();
        s2.displayInfo();
    }
}