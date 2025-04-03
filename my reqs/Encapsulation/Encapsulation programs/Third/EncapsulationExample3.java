// Encapsulated class
class BankAccount {
    private double balance; // Private variable

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

// Main class
public class EncapsulationExample3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        System.out.println("Initial Balance: $" + account.getBalance());

        account.deposit(200);
        account.withdraw(100);
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
