import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            File myFileObj = new File("./secrets.txt");
            if (!myFileObj.exists())
                myFileObj.createNewFile();
            else
                System.out.println("The  file already exists");
            FileWriter myFileWriterObj = new FileWriter("./secrets.txt");
            myFileWriterObj.write("This is a secret file. Shhhh...");
            myFileWriterObj.close();
            Scanner myScannerObj = new Scanner(myFileObj);
            System.out.println("The contents of the file are: ");
            while (myScannerObj.hasNextLine()) {
                System.out.println(myScannerObj.nextLine());
            }
            myScannerObj.close();

        } catch (IOException e) {
            System.out.println("Oops! Error Occured");
            e.printStackTrace();
        }

    }
}