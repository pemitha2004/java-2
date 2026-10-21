public class main { 
    public static void  main (string[]args)  {
        system..out.println("Hello world");
        system..out.println("Name:Pemitha");
        system..out.println("Degree:Computer science");


        // user input
        scanner sc=new scanner();

        system.out.println("enter a value")
        int num=sc.nextln();
        system.out.println("value enter by the user:"+num);



        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        // Perform operations
        System.out.println("Total = " + (num1 + num2));
        System.out.println("Subtraction = " + (num1 - num2));
        System.out.println("Multiplication = " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division = " + (num1 / num2));
        } else {
            System.out.println("Division is not possible (cannot divide by zero).");
        }

        input.close();





        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input name and birth year
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        // Calculate age (change 2025 if needed)
        int currentYear = 2025;
        int age = currentYear - birthYear;

        // Check if teenager
        if (age >= 13 && age <= 19) {
            System.out.println(name + " is a teenager.");
        } else {
            System.out.println(name + " is not a teenager.");
        }

        input.close();
    }



    
    public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Executing Loop " + i);
        }
    }
}
} 
    }
}
        

    }
}    

        
