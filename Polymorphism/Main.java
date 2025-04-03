class Animal {
    public void animalSound() {
        System.out.println("Animal makes sound!");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Pig says wee! wee!");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("Dog say bow wow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimalObj = new Animal();
        Pig myPigObj = new Pig();
        Dog myDogObj = new Dog();
        myAnimalObj.animalSound();
        myPigObj.animalSound();
        myDogObj.animalSound();
    }
}