import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1, count = 0;
        System.out.print("Fibonacci Series: ");
        while (count < n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        }
        sc.close();
    }
}
