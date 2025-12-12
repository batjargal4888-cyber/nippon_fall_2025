public class SavingAccount extends BankAccount {
    double interestRate;

    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance = balance + balance * interestRate;
        System.out.println("Huu nemegdlee: " + interest);
        System.out.println("Uldegdel:" + balance);
    }
}
