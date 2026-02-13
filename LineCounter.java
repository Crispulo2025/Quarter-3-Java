import java.io.*;

public class LineCounter {
    public static void main(String[] args) {
        String filename = "data.txt"; // File to read
        int lineCount = 0;

        // Reading the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while (reader.readLine() != null) { // Read each line
                lineCount++;                     // Increment counter
            }
            System.out.println("Number of lines in " + filename + ": " + lineCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
