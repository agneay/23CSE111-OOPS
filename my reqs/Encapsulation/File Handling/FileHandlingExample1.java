import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample1 {
    public static void main(String[] args) {
        try {
            File file = new File("example1.txt"); // File object
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Writing to the file
            FileWriter writer = new FileWriter("example1.txt");
            writer.write("Hello, this is a file handling example in Java.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
