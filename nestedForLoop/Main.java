public class Main {
    public static void main(String[] args) {
        System.out.println("Starting program....");
        for (int limit = 1; limit <= 3; ++limit) {
            for (int num = 1; num <= 10; num++) {
                System.out.println(limit + " * " + num + " = " + limit * num);
            }
            System.out.println("----");
        }
    }
}