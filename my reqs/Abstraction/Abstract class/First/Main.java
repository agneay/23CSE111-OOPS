// Abstract class
abstract class Animal {
    // Abstract method (without implementation)
    abstract void makeSound();

    // Concrete method (with implementation)
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Subclass implementing the abstract method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound(); // Calls the implemented method
        d.sleep(); // Calls the inherited concrete method
    }
}
