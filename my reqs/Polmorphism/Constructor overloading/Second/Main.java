// Car class with constructor overloading
class Car {
    String brand;
    String model;
    int year;

    // Default Constructor
    Car() {
        System.out.println("Default Constructor called.");
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Constructor with brand only
    Car(String b) {
        System.out.println("Constructor with Brand called.");
        brand = b;
        model = "Unknown";
        year = 0;
    }

    // Constructor with brand and model
    Car(String b, String m) {
        System.out.println("Constructor with Brand & Model called.");
        brand = b;
        model = m;
        year = 0;
    }

    // Constructor with brand, model, and year
    Car(String b, String m, int y) {
        System.out.println("Constructor with Brand, Model & Year called.");
        brand = b;
        model = m;
        year = y;
    }

    // Display method
    void display() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }
}

// Main class
public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        // Using Default Constructor
        Car car1 = new Car();
        car1.display();

        // Using Constructor with Brand
        Car car2 = new Car("Toyota");
        car2.display();

        // Using Constructor with Brand & Model
        Car car3 = new Car("Honda", "Civic");
        car3.display();

        // Using Constructor with Brand, Model & Year
        Car car4 = new Car("Ford", "Mustang", 2024);
        car4.display();
    }
}
