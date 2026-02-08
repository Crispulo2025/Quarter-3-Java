import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt"); // File may not exist
            Scanner reader = new Scanner(file); // This can throw FileNotFoundException

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file path.");
        }
    }
}
