import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {
    public static void main(String[] args) {

        try {
            // Create a FileWriter object
            FileWriter writer = new FileWriter("output.txt");

            // Write a simple message to the file
            writer.write("Hello! This is a simple message written to a file using FileWriter.");

            // Close the writer to save the file
            writer.close();

            System.out.println("File created and message written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}