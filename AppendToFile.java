import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {

    public static void main(String[] args) {
        String fileName = "sample.txt"; // File to append to

        try (Scanner sc = new Scanner(System.in);
             FileWriter fw = new FileWriter(fileName, true)) { // 'true' enables append mode

            System.out.print("Enter text to append: ");
            String textToAppend = sc.nextLine();

            // Append text followed by a newline
            fw.write(textToAppend + System.lineSeparator());

            System.out.println("Text successfully appended to " + fileName);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
