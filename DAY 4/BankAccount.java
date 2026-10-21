public class BankAccount {

    String accountNo;
    String holderName;
    double balance;

    public BankAccount() {
        accountNo = "000000";
        holderName = "Unknown";
        balance = 0.0;
    }

    
    public BankAccount(String accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Updated Balance: " + balance);
    }

    
    public String withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return "Withdrawal successful. Remaining balance: " + balance;
        } else {
            return "Insufficient funds.";
        }
    }

    
    public double getBalance() {
        return balance;
    }

    
    public String getAccountInfo(String branch) {
        return "Account No: " + accountNo +
               ", Holder Name: " + holderName +
               ", Branch: " + branch;
    }

    public static void main(String[] args) {

    
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("ACC1001", "John", 50000);

    
        System.out.println("----- Account 1 -----");
        acc1.deposit(1000);
        System.out.println(acc1.withdraw(500));
        System.out.println("Balance: " + acc1.getBalance());
        System.out.println(acc1.getAccountInfo("Colombo"));
        System.out.println("\n----- Account 2 -----");
        acc2.deposit(5000);
        System.out.println(acc2.withdraw(10000));
        System.out.println("Balance: " + acc2.getBalance());
        System.out.println(acc2.getAccountInfo("Kandy"));
    }
}