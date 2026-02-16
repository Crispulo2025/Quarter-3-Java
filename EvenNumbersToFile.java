import java.io.*;

public class EvenNumbersToFile {
    public static void main(String[] args) {
        String inputFile = "numbers.txt";      // Input file containing numbers
        String outputFile = "even_numbers.txt"; // Output file to save even numbers

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into numbers (assuming numbers are space-separated)
                String[] numbers = line.split("\\s+");
                for (String numStr : numbers) {
                    try {
                        int num = Integer.parseInt(numStr);
                        if (num % 2 == 0) {
                            writer.write(num + " ");
                        }
                    } catch (NumberFormatException e) {
                        // Skip any non-numeric values
                        continue;
                    }
                }
                writer.newLine();
            }

            reader.close();
            writer.close();
            System.out.println("Even numbers have been written to " + outputFile);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
