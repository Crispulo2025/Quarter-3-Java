import java.io.*;

public class CountLines {
    public static void main(String[] args) {
        String inputFile = "input.txt"; // File to count lines from
        int lineCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            while (reader.readLine() != null) {
                lineCount++; // Increment for each line
            }
            reader.close();

            System.out.println("The file \"" + inputFile + "\" has " + lineCount + " lines.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
