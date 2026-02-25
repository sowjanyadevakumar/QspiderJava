class SavingsAccount {
    String owner;
    double balance;

    SavingsAccount(String o, double b) {
        owner = o;
        balance = b;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " deposited " + amount + " | New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println(owner + " withdrew " + amount + " | New Balance: " + balance);
        }
    }

    void showBalance() {
        System.out.println(owner + "'s Balance: " + balance);
    }
}

public class P14_NonStaticMethodWithFields {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("Priya", 10000.0);
        acc.showBalance();
        acc.deposit(5000);
        acc.withdraw(3000);
        acc.withdraw(15000);
    }
}
