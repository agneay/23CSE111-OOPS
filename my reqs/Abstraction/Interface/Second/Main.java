// First interface
interface Flyable {
    void fly();
}

// Second interface
interface Swimable {
    void swim();
}

// Class implementing both interfaces
class Bird implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Bird is swimming.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.fly();
        b.swim();
    }
}
