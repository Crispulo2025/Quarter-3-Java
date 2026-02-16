import java.io.*;
import java.util.Scanner;

public class FileErrorHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the filename to read: ");
        String fileName = sc.nextLine();

        try {
            // Try to open the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            System.out.println("\nFile contents:\n");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
            System.out.println("\nFile read successfully!");

        } 
        catch (FileNotFoundException e) {
            System.out.println("Error: The file \"" + fileName + "\" was not found.");
            System.out.println("Please check the filename and try again.");
        } 
        catch (IOException e) {
            System.out.println("Error: A problem occurred while reading the file.");
            System.out.println("Details: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        sc.close();
    }
}
