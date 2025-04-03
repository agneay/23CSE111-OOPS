// Superclass (Parent class)
class Animal {
    // Property of the superclass
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method of the superclass
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass (Child class) inherits from Animal
class Dog extends Animal {
    // Constructor of subclass
    public Dog(String name) {
        super(name); // Calling the superclass constructor
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Main class to run the code
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Generic Animal");
        myAnimal.makeSound();

        Dog myDog = new Dog("Buddy");
        myDog.makeSound(); // This will use the overridden method
    }
}
