// Parent class: Bank
class Bank {
    double getInterestRate() {
        return 5.0; // Default interest rate
    }
}

// Child class 1: SBI overriding getInterestRate()
class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5; // SBI specific interest rate
    }
}

// Child class 2: HDFC overriding getInterestRate()
class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.2; // HDFC specific interest rate
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        System.out.println("Bank Interest Rate: " + b1.getInterestRate() + "%");

        Bank b2 = new SBI(); // Dynamic Method Dispatch
        System.out.println("SBI Interest Rate: " + b2.getInterestRate() + "%");

        Bank b3 = new HDFC(); // Dynamic Method Dispatch
        System.out.println("HDFC Interest Rate: " + b3.getInterestRate() + "%");
    }
}
