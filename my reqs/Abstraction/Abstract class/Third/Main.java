// Abstract class
abstract class Vehicle {
    String brand;

    // Constructor
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle brand: " + brand);
    }

    // Abstract method
    abstract void start();
}

// Subclass implementing the abstract method
class Car extends Vehicle {
    Car(String brand) {
        super(brand); // Calling the parent class constructor
    }

    @Override
    void start() {
        System.out.println("Car is starting...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota");
        c.start();
    }
}
