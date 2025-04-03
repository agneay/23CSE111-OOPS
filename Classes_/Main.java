public class Main {
    public int x = 5;

    public static void main(String[] args) {
        Main myFirstMainObj = new Main();
        Main mySecondMainObj = new Main();
        mySecondMainObj.x += 10;
        System.out.println(myFirstMainObj.x);
        System.out.println(mySecondMainObj.x);
    }
}