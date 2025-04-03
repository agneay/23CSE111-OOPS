// Base class - Animal
class Animal {
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display animal details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class 1 - Dog (inherits from Animal)
class Dog extends Animal {
    String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age); // Call the constructor of Animal
        this.breed = breed;
    }

    // Method to display dog details
    public void displayDogDetails() {
        displayDetails(); // Call method from Animal class
        System.out.println("Breed: " + breed);
    }
}

// Derived class 2 - Cat (inherits from Animal)
class Cat extends Animal {
    String color;

    // Constructor
    public Cat(String name, int age, String color) {
        super(name, age); // Call the constructor of Animal
        this.color = color;
    }

    // Method to display cat details
    public void displayCatDetails() {
        displayDetails(); // Call method from Animal class
        System.out.println("Color: " + color);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an object of Dog
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        // Create an object of Cat
        Cat cat = new Cat("Whiskers", 2, "Black");

        // Call methods to display details
        System.out.println("Dog Details:");
        dog.displayDogDetails(); // Displays dog details

        System.out.println("\nCat Details:");
        cat.displayCatDetails(); // Displays cat details
    }
}
