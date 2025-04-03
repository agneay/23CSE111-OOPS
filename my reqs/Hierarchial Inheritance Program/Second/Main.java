// Base class - Vehicle
class Vehicle {
    String brand;
    int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Derived class 1 - Car (inherits from Vehicle)
class Car extends Vehicle {
    int numberOfDoors;

    // Constructor
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Call the constructor of Vehicle
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display car details
    public void displayCarDetails() {
        displayDetails(); // Call method from Vehicle class
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Derived class 2 - Truck (inherits from Vehicle)
class Truck extends Vehicle {
    int loadCapacity;

    // Constructor
    public Truck(String brand, int year, int loadCapacity) {
        super(brand, year); // Call the constructor of Vehicle
        this.loadCapacity = loadCapacity;
    }

    // Method to display truck details
    public void displayTruckDetails() {
        displayDetails(); // Call method from Vehicle class
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an object of Car
        Car car = new Car("Toyota", 2021, 4);
        // Create an object of Truck
        Truck truck = new Truck("Ford", 2018, 10);

        // Call methods to display details
        System.out.println("Car Details:");
        car.displayCarDetails(); // Displays car details

        System.out.println("\nTruck Details:");
        truck.displayTruckDetails(); // Displays truck details
    }
}
