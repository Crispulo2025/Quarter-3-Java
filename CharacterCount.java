import java.io.*;

public class CharacterCount {
    public static void main(String[] args) {
        String inputFile = "input.txt"; // File to count characters from
        int charCount = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            int c;
            // Read character by character
            while ((c = reader.read()) != -1) {
                charCount++;
            }

            reader.close();
            System.out.println("The file \"" + inputFile + "\" has " + charCount + " characters.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
