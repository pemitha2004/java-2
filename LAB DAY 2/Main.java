import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, m4, total;
        double avg;

        System.out.print("Enter 4 marks: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();

        total = m1 + m2 + m3 + m4;
        avg = total / 4.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);

        if (avg > 80)
            System.out.println("Grade = A");
        else if (avg >= 65)
            System.out.println("Grade = B");
        else if (avg >= 50)
            System.out.println("Grade = C");
        else
            System.out.println("Grade = F");

        sc.close();
    }
}