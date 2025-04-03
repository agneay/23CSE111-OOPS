// Base class
class A {
    void displayA() {
        System.out.println("Class A: Base Class");
    }
}

// Derived class B inheriting from A (Single Inheritance)
class B extends A {
    void displayB() {
        System.out.println("Class B: Derived from A");
    }
}

// Interface C
interface C {
    void displayC();
}

// Class D inheriting from B and implementing interface C (Hybrid Inheritance)
class D extends B implements C {
    public void displayC() {
        System.out.println("Class C: Implemented in D");
    }

    void displayD() {
        System.out.println("Class D: Derived from B and implements C");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        D obj = new D();
        obj.displayA(); // From Class A
        obj.displayB(); // From Class B
        obj.displayC(); // From Interface C (Implemented in D)
        obj.displayD(); // From Class D
    }
}
