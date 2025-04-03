public class Main {
    static int sum(int num) {
        if (num == 0) {
            return 0;
        }
        return num + sum(num - 1);
    }

    public static void main(String[] args) {
        System.out.println("Trying to get java print sum of numbers from recurssive functions");
        System.out.println(sum(10));
    }
}