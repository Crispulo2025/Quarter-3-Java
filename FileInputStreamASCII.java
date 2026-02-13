import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamASCII {
    public static void main(String[] args) {
        String filename = "data.txt"; // File to read

        try (FileInputStream fis = new FileInputStream(filename)) {
            int byteRead;
            System.out.println("ASCII values of each byte in " + filename + ":");

            while ((byteRead = fis.read()) != -1) { // Read one byte at a time
                System.out.println(byteRead);        // Print ASCII value
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
