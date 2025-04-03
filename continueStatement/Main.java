public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 2 || i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}