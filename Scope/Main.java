public class Main {
    public static void main(String[] args) {
        // code here cannot use x
        // code here cannot use y
        int x = 100;
        {
            // code here cannot use y

            int y = 200;

            // code here can use y
        }
        // code here cannot use y
        // code here can use x
        System.out.println(x);
    }
}