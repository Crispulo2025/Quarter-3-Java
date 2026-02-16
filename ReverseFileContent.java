import java.io.*;
import java.util.*;

public class ReverseFileContent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = input.nextLine();

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }

        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            // Read all lines and store them
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            // Display lines in reverse order
            System.out.println("\nFile content in reverse order:");
            for (int i = lines.size() - 1; i >= 0; i--) {
                System.out.println(lines.get(i));
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        input.close();
    }
}
