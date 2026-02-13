import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedByteReader {
    public static void main(String[] args) {
        String filename = "data.txt"; // File to read
        int bytesRead = 0;

        // Try-with-resources to ensure the stream is closed properly
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename))) {
            int b;
            while ((b = bis.read()) != -1) { // Read one byte at a time
                bytesRead++;
            }
            System.out.println("Total bytes read from " + filename + ": " + bytesRead);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
