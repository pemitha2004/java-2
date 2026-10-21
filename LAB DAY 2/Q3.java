import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 7 == 0) {
            System.out.println("Divisible by both 2 and 7");
        } else if (num % 2 == 0 || num % 7 == 0) {
            System.out.println("Divisible by only one of them");
        } else {
            System.out.println("Not divisible by either");
        }

        sc.close();
    }
}