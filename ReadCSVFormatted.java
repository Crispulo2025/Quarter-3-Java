import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFormatted {

    public static void main(String[] args) {

        String fileName = "data.csv";  // Change to your CSV file name

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            int rowNumber = 1;

            while ((line = reader.readLine()) != null) {

                String[] values = line.split(",");

                System.out.println("Row " + rowNumber + ":");

                for (int i = 0; i < values.length; i++) {
                    System.out.printf("  Column %d: %s%n", i + 1, values[i].trim());
                }

                System.out.println("------------------------");
                rowNumber++;
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}