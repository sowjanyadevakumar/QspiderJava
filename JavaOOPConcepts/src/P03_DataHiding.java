class BankAccount {
    private String owner;
    private double balance;
    private String pin;

    BankAccount(String owner, double balance, String pin) {
        this.owner = owner;
        this.balance = balance;
        this.pin = pin;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(String enteredPin, double amount) {
        if (!enteredPin.equals(pin)) {
            System.out.println("Wrong PIN. Access denied.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class P03_DataHiding {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Priya", 20000, "1234");
        acc.deposit(5000);
        acc.withdraw("9999", 3000);
        acc.withdraw("1234", 3000);
    }
}
