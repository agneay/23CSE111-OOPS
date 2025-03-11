import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculation
        double simpleInterest = (principal * rate * time) / 100;

        // Output
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + (principal + simpleInterest));
        sc.close();
    }
}
