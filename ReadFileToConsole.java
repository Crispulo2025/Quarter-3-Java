import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileToConsole {
    public static void main(String[] args) {
        String filename = "data.txt"; // File to read

        try (FileInputStream fis = new FileInputStream(filename)) {
            int byteRead;
            System.out.println("Contents of " + filename + ":");

            // Read and display each byte as a character
            while ((byteRead = fis.read()) != -1) {
                System.out.print((char) byteRead);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
