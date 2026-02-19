import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        String fileName = "sample.txt"; // input file
        String targetWord = "java";      // word to count
        int count = 0;

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next();
                // Compare words ignoring case
                if (word.equalsIgnoreCase(targetWord)) {
                    count++;
                }
            }

            scanner.close();

            System.out.println("The word \"" + targetWord + "\" appears " + count + " times in the file.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}