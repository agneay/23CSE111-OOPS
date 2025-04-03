// Define an interface
interface Vehicle {
    void start();

    // Default method
    default void honk() {
        System.out.println("Vehicle is honking.");
    }

    // Static method
    static void show() {
        System.out.println("This is a Vehicle interface.");
    }
}

// Implementing class
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.honk(); // Calling default method

        Vehicle.show(); // Calling static method
    }
}
