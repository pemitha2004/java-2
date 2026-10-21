public abstract class Account {
    private int accountNumber;
    private double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void updateBalance(double amount) {
        balance += amount;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends Account {
    SavingsAccount(int number, double balance) {
        super(number, balance);
    }

    void deposit(double amount) {
        updateBalance(amount);
    }

    void withdraw(double amount) {
        if (amount > getBalance())
            System.out.println("Invalid Withdrawal");
        else
            updateBalance(-amount);
    }
}

class CheckingAccount extends Account {
    CheckingAccount(int number, double balance) {
        super(number, balance);
    }

    void deposit(double amount) {
        updateBalance(amount);
    }

    void withdraw(double amount) {
        if (getBalance() - amount < -10000)
            System.out.println("Invalid Withdrawal");
        else
            updateBalance(-amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Account s = new SavingsAccount(101, 5000);
        Account c = new CheckingAccount(102, 5000);

        s.deposit(2000);
        s.withdraw(1000);
        s.withdraw(10000);

        c.deposit(2000);
        c.withdraw(1000);
        c.withdraw(20000);

        System.out.println("Savings Balance: Rs. " + s.getBalance());
        System.out.println("Checking Balance: Rs. " + c.getBalance());
    }
} {
    
}
