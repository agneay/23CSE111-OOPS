import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(1);
        myArray.add(100);
        myArray.add(0, 10);
        System.out.println(myArray);
        System.out.println("The first item in the list is " + myArray.get(0));
        myArray.set(0, 100);
        myArray.remove(0);
        myArray.clear();
        myArray.size();
        Collections.sort(myArray);

    }
}