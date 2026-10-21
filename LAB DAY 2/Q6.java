import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 10;
        } else if (units <= 200) {
            bill = (100 * 10) + ((units - 100) * 15);
        } else {
            bill = (100 * 10) + (100 * 15) + ((units - 200) * 20);
        }

        System.out.println("Units Consumed : " + units);
        System.out.println("Electricity Bill = Rs. " + bill);

        sc.close();
    }
}