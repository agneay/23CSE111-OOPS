// Define an interface
interface Animal {
    void makeSound(); // Abstract method
}

// Implementing class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
