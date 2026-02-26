class InsufficientFundsException extends Exception {
    double amount;

    InsufficientFundsException(double amount) {
        super("Insufficient funds. Short by: " + amount);
        this.amount = amount;
    }
}

class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
    }

    double getBalance() {
        return balance;
    }
}

public class P11_ProgramOnException {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Sowjanya", 5000.0);

        try {
            account.deposit(1500);
            account.withdraw(2000);
            account.withdraw(6000);
        } catch (InsufficientFundsException e) {
            System.out.println("Custom Exception: " + e.getMessage());
            System.out.println("Shortfall amount: " + e.amount);
        }

        try {
            account.deposit(-500);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
