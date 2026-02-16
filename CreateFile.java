import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        String outputFile = "output.txt"; // Name of the file to create
        String text = "Hello, this is a line of text written using character streams.";

        try {
            // Create FileWriter to write character data to the file
            FileWriter writer = new FileWriter(outputFile);
            
            // Write the text to the file
            writer.write(text);
            
            // Close the writer
            writer.close();

            System.out.println("File \"" + outputFile + "\" has been created with the text.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
