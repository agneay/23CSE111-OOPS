// Interface
interface Drivable {
    void drive();
}

// Abstract class implementing the interface
abstract class Bike implements Drivable {
    abstract void fuelType();
}

// Subclass providing implementations
class ElectricBike extends Bike {
    @Override
    void fuelType() {
        System.out.println("Electric Bike runs on battery.");
    }

    @Override
    public void drive() {
        System.out.println("Electric Bike is being driven.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Bike myBike = new ElectricBike();
        myBike.fuelType();
        myBike.drive();
    }
}
