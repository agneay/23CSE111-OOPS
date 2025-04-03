// Shape class demonstrating method overloading
class Shape {

    // Method 1: Area of a square
    int area(int side) {
        System.out.println("Calculating area of square:");
        return side * side;
    }

    // Method 2: Area of a rectangle
    int area(int length, int width) {
        System.out.println("Calculating area of rectangle:");
        return length * width;
    }

    // Method 3: Area of a circle (double parameter)
    double area(double radius) {
        System.out.println("Calculating area of circle:");
        return Math.PI * radius * radius;
    }

    // Method 4: Area of a triangle
    double area(double base, double height) {
        System.out.println("Calculating area of triangle:");
        return 0.5 * base * height;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        // Calling different overloaded methods
        System.out.println("Area: " + shape.area(5)); // Square
        System.out.println("Area: " + shape.area(4, 6)); // Rectangle
        System.out.println("Area: " + shape.area(3.5)); // Circle
        System.out.println("Area: " + shape.area(5.0, 8.0)); // Triangle
    }
}
