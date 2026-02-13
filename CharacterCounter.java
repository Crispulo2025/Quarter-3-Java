import java.io.FileReader;
import java.io.IOException;

public class CharacterCounter {

    public static void main(String[] args) {
        String fileName = "sample.txt"; // File to read
        int charCount = 0;

        try (FileReader fr = new FileReader(fileName)) {
            int c;
            while ((c = fr.read()) != -1) {
                charCount++;
            }
            System.out.println("Total number of characters in the file: " + charCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
