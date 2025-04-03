// Superclass (Parent class)
class Vehicle {
    // Property of superclass
    String brand;

    // Constructor of superclass
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Method of superclass
    public void start() {
        System.out.println(brand + " is starting.");
    }
}

// Subclass (Child class) inherits from Vehicle
class Car extends Vehicle {
    // Property specific to Car
    int doors;

    // Constructor of subclass
    public Car(String brand, int doors) {
        super(brand); // Calling the superclass constructor
        this.doors = doors;
    }

    // Overriding the start method
    @Override
    public void start() {
        System.out.println(brand + " car with " + doors + " doors is starting.");
    }
}

// Main class to run the code
public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("Toyota");
        myVehicle.start();

        Car myCar = new Car("Honda", 4);
        myCar.start(); // This will use the overridden method
    }
}
