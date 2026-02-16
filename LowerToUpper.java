import java.io.*;

public class LowerToUpper {
    public static void main(String[] args) {
        // Input and output file names
        String inputFile = "input.txt";   // Original file
        String outputFile = "output.txt"; // File to save uppercase content

        try {
            // Create FileReader and BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            // Create FileWriter and BufferedWriter to write the new file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                // Convert each line to uppercase
                String upperLine = line.toUpperCase();
                // Write the uppercase line to the new file
                writer.write(upperLine);
                writer.newLine(); // add a newline character
            }

            // Close resources
            reader.close();
            writer.close();

            System.out.println("File has been converted to uppercase and saved as " + outputFile);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
