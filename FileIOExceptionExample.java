import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExceptionExample {
    public static void main(String[] args) {
        String filename = "example.txt";

        try {
            // Attempt to open the file
            File file = new File(filename);
            FileReader reader = new FileReader(file);

            System.out.println(filename + " opened successfully.");

            // Read first character (for demonstration)
            int firstChar = reader.read();
            System.out.println("First character in the file: " + (char) firstChar);

            // Close the file
            reader.close();
        } catch (IOException e) {
            // Handles FileNotFoundException and other I/O errors
            System.out.println("An I/O error occurred: " + e.getMessage());
        }

        System.out.println("Program continues running after exception handling.");
    }
}
