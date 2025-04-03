// Define an interface
interface Payment {
    void processPayment(int amount);
}

// Implementing class 1
class CreditCardPayment implements Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Credit Card Payment of $" + amount + " processed.");
    }
}

// Implementing class 2
class PayPalPayment implements Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("PayPal Payment of $" + amount + " processed.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.processPayment(100);

        Payment p2 = new PayPalPayment();
        p2.processPayment(200);
    }
}
