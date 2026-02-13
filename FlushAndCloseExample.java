import java.io.*;

public class FlushAndCloseExample {
    public static void main(String[] args) {
        String filename = "output.txt";

        // Use try-with-resources to automatically close streams
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            // Write some data to the file
            writer.write("Line 1: This demonstrates flushing.");
            writer.newLine();
            writer.write("Line 2: Streams must be closed properly.");
            writer.newLine();

            // Flush the stream to ensure all data is written to the file
            writer.flush();
            System.out.println("Data flushed to " + filename);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // At this point, BufferedWriter is automatically closed due to try-with-resources
        System.out.println("Stream closed automatically after try-with-resources.");
    }
}
