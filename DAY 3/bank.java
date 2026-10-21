class BankAccount {
    String accountHolder;
    double balance;

    void displayInfo() {
        System.out.println("Name: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    void depositMultiple(int times, double amount) {
        for (int i = 1; i <= times; i++) {
            balance = balance + amount;
            System.out.println("Balance: " + balance);
        }
    }

    void checkStatus() {
        if (balance < 1000)
            System.out.println("Low Balance");
        else if (balance <= 10000)
            System.out.println("Moderate Balance");
        else
            System.out.println("High Balance");
    }

    boolean canWithdraw(double amount) {
        if (amount <= balance)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();

        acc1.accountHolder = "Nimal";
        acc1.balance = 500;

        acc1.displayInfo();
        acc1.checkStatus();

        acc1.depositMultiple(3, 500);

        acc1.checkStatus();

        System.out.println(acc1.canWithdraw(5000));
    }
}