import geometry.AreaCalculator;

public class GeometryApp {
    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();

        double circle = ac.circleArea(7.5);
        double rectangle = ac.rectangleArea(10, 5);

        System.out.println("Area of Circle: " + circle);
        System.out.println("Area of Rectangle: " + rectangle);
    }
}
