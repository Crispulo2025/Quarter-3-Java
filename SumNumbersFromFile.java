import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumNumbersFromFile {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the path of the file containing numbers: ");
        String filePath = inputScanner.nextLine();

        File file = new File(filePath);

        if (!file.exists() || !file.isFile()) {
            System.out.println("File does not exist or is not valid.");
            inputScanner.close();
            return;
        }

        double sum = 0;

        try (Scanner fileScanner = new Scanner(file)) {

            // Read numbers from the file
            while (fileScanner.hasNext()) {
                if (fileScanner.hasNextDouble()) {
                    double number = fileScanner.nextDouble();
                    sum += number;
                } else {
                    // Skip non-numeric data
                    fileScanner.next();
                }
            }

            System.out.println("The sum of all numbers in the file is: " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }

        inputScanner.close();
    }
}
