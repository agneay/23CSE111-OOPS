interface Animal {
    public void animalSound();

    public void sleep();
}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says Wee! Wee!");
    }

    public void sleep() {
        System.out.println("Zzzz");
    }
}

public class Main {
    public static void main(String[] args) {
        Pig myPigObj = new Pig();
        myPigObj.animalSound();
        myPigObj.sleep();
    }
}
