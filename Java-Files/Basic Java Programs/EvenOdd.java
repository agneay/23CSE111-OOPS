import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Input Enter the number:");
        Scanner myScannerObj = new Scanner(System.in);
        int num = myScannerObj.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        myScannerObj.close();
    }
}