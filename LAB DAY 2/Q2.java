public class Q2 {
    public static void main(String[] args) {
        int x = 7;

        int y = x++ + ++x + --x + x--;

        System.out.println("x = " + x + ", y = " + y);
    }
}