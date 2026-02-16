import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StoreUserInputToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the filename to store input: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        try (FileWriter writer = new FileWriter(file, true)) { // 'true' for appending
            String userInput;
            String choice;

            do {
                System.out.print("Enter text to store in the file: ");
                userInput = scanner.nextLine();

                writer.write(userInput + System.lineSeparator());

                System.out.print("Do you want to enter more text? (yes/no): ");
                choice = scanner.nextLine().trim().toLowerCase();

            } while (choice.equals("yes") || choice.equals("y"));

            System.out.println("User input successfully stored in " + file.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
