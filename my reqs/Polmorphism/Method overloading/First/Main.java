// Calculator class demonstrating method overloading
class Calculator {

    // Method 1: Addition of two integers
    int add(int a, int b) {
        System.out.println("Adding two integers:");
        return a + b;
    }

    // Method 2: Addition of three integers
    int add(int a, int b, int c) {
        System.out.println("Adding three integers:");
        return a + b + c;
    }

    // Method 3: Addition of two double values
    double add(double a, double b) {
        System.out.println("Adding two double values:");
        return a + b;
    }

    // Method 4: Concatenation of two strings
    String add(String a, String b) {
        System.out.println("Concatenating two strings:");
        return a + b;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling different overloaded methods
        System.out.println(calc.add(5, 10)); // Two integers
        System.out.println(calc.add(3, 7, 2)); // Three integers
        System.out.println(calc.add(4.5, 2.3)); // Two doubles
        System.out.println(calc.add("Hello, ", "World!")); // Two Strings
    }
}
