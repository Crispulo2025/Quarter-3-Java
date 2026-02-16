import java.io.*;
import java.util.Scanner;

public class FilterLinesByKeyword {
    public static void main(String[] args) {
        String inputFile = "input.txt"; // File to read from

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the keyword to search for: ");
        String keyword = sc.nextLine();
        sc.close();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            System.out.println("\nLines containing the keyword \"" + keyword + "\":\n");

            while ((line = reader.readLine()) != null) {
                if (line.contains(keyword)) { // Check if line contains the keyword
                    System.out.println(line);
                }
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
