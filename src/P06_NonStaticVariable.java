class BankAccount {
    int accountNo;
    double balance;

    void showBalance() {
        System.out.println("Account No: " + accountNo + " | Balance: " + balance);
    }
}

public class P06_NonStaticVariable {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.accountNo = 1001;
        acc1.balance = 50000.0;

        BankAccount acc2 = new BankAccount();
        acc2.accountNo = 1002;
        acc2.balance = 75000.0;

        acc1.showBalance();
        acc2.showBalance();
    }
}
