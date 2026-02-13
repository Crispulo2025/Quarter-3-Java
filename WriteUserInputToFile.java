import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteUserInputToFile {
    public static void main(String[] args) {
        String filename = "userinput.txt";

        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            System.out.println("Enter text to write to the file (type 'exit' to finish):");

            while (true) {
                String input = scanner.nextLine(); // Read user input
                if (input.equalsIgnoreCase("exit")) {
                    break; // Stop if user types "exit"
                }
                writer.write(input);   // Write input to file
                writer.newLine();      // Add a new line after each input
            }

            System.out.println("User input has been saved to " + filename);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
