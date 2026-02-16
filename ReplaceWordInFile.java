import java.io.*;
import java.util.Scanner;

public class ReplaceWordInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for file path
        System.out.print("Enter the path of the file: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);

        if (!file.exists() || !file.isFile()) {
            System.out.println("File does not exist or is not valid.");
            scanner.close();
            return;
        }

        // Ask for the word to replace and the new word
        System.out.print("Enter the word to be replaced: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        StringBuilder fileContent = new StringBuilder();

        // Read file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Replace old word with new word in each line
                line = line.replace(oldWord, newWord);
                fileContent.append(line).append(System.lineSeparator());
            }

        } catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
            scanner.close();
            return;
        }

        // Write updated content back to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(fileContent.toString());
            System.out.println("All occurrences of \"" + oldWord + "\" have been replaced with \"" + newWord + "\".");
        } catch (IOException e) {
            System.out.println("Error writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
