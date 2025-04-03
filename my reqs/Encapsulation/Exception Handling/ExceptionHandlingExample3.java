public class ExceptionHandlingExample3 {
    public static void main(String[] args) {
        try {
            System.out.println("Trying to divide...");
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("Execution completed. Cleaning up resources...");
        }
    }
}
