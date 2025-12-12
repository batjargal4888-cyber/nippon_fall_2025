public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println(amount + " orlogo nemegdlee.");
        System.out.println("Uldegdel: " + balance);
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
        System.out.println(amount + " zarlaga garlaa.");
        System.out.println("Uldegdel: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void printInfo() {
        System.out.println("Dans: " + accountNumber);
        System.out.println("Uldegdel: " + balance);
    }
}