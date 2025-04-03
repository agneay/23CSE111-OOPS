public class Main {
    static int plusMethod(int a, int b) {
        return a + b;
    }

    static double plusMethod(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int res1 = plusMethod(1, 2);
        double res2 = plusMethod(1.2d, 3d);
        System.out.println(res1 + " " + res2);
    }
}