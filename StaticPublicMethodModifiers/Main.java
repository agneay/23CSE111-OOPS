public class Main {
    static void myFirstMethod() {
        System.out.println("Hey, This is the first method!");
    }

    public void mySecondMethod() {
        System.out.println("Hey, This is the second method!");
    }

    public static void main(String[] args) {
        Main myMainObj = new Main();
        myMainObj.mySecondMethod();

        myFirstMethod();
    }
}