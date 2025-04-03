import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] myNum = new int[2][2];
        myNum[0][0] = 1;
        myNum[0][1] = 10;
        myNum[1][0] = 10;
        myNum[1][1] = 1;
        System.out.println(myNum);
        System.out.println(Arrays.deepToString(myNum));
    }
}