// Abstract class
abstract class Shape {
    // Abstract method
    abstract void draw();
}

// Subclass 1
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Subclass 2
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw(); // Calls the Circle's implementation

        Shape s2 = new Rectangle();
        s2.draw(); // Calls the Rectangle's implementation
    }
}
