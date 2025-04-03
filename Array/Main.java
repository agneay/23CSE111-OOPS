import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] cars = new String[5];
        cars[0] = "Lamborghini";
        cars[1] = "Aston Martin";
        cars[2] = "Rolls Royce";
        System.out.println(cars); // prints weird stuff
        System.out.println(Arrays.toString(cars));
    }
}