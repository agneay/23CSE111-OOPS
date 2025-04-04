package geometry;

public class AreaCalculator {
    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double rectangleArea(double length, double width) {
        return length * width;
    }
}
