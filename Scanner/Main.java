import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScannerObj = new Scanner(System.in);
        System.out.println("Enter your username:");
        String name = myScannerObj.nextLine();
        System.out.println("Enter your age");
        int age = myScannerObj.nextInt();
    }
}