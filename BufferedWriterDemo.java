import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    public static void main(String[] args) {

        // File name
        String fileName = "output.txt";

        // Sample lines to write
        String[] lines = {
            "Line 1: Hello, this is the first line.",
            "Line 2: BufferedWriter makes writing efficient.",
            "Line 3: Each line ends with a new line character.",
            "Line 4: Java makes file writing simple!"
        };

        // Using try-with-resources for automatic closing
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine(); // adds a newline after each line
            }
            System.out.println("File written successfully using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
