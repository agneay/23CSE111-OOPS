public class Main {
    public final double pi = 3.14;

    public static void main(String[] args) {
        Main myMainObj = new Main();
        // myMainObj.pi = 2; will generate error!
        System.out.println(myMainObj.pi);
    }
}