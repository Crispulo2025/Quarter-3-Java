import java.io.*;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        String fileName = "output.txt"; // File to append text to

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text to append: ");
        String newText = sc.nextLine();
        sc.close();

        try {
            // FileWriter with 'true' in constructor enables append mode
            FileWriter writer = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            // Write new text and add a newline
            bufferedWriter.write(newText);
            bufferedWriter.newLine();

            // Close the writer
            bufferedWriter.close();

            System.out.println("Text has been appended to \"" + fileName + "\" successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
