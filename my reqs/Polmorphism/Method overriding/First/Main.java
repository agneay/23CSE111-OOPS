// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animals make sounds");
    }
}

// Child class overriding makeSound() method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Parent class object
        myAnimal.makeSound();

        Dog myDog = new Dog(); // Child class object
        myDog.makeSound();
    }
}
