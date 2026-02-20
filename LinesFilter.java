import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LinesFilter {

    public static void main(String[] args) {
        String fileName = "sample.txt";      // Input file
        String targetWord = "Java";          // Word to match at the start of a line

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            System.out.println("Lines starting with \"" + targetWord + "\":");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim(); // remove leading/trailing spaces

                if (line.startsWith(targetWord)) {
                    System.out.println(line);
                }
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}