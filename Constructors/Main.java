public class Main {
    public static int x = 5;

    public Main() {
        this.x = 10;
    }

    public static void main(String[] args) {
        Main myMainObj = new Main();
        System.out.println(myMainObj.x);
        System.out.println(x);

    }
}