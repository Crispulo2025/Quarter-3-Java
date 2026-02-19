import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HighestLowest {

    public static void main(String[] args) {

        String fileName = "numbers.txt";

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            if (!scanner.hasNextDouble()) {
                System.out.println("File does not contain numeric data.");
                scanner.close();
                return;
            }

            double number = scanner.nextDouble();
            double highest = number;
            double lowest = number;

            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    number = scanner.nextDouble();

                    if (number > highest) {
                        highest = number;
                    }

                    if (number < lowest) {
                        lowest = number;
                    }
                } else {
                    scanner.next(); // skip non-numeric values
                }
            }

            scanner.close();

            System.out.println("Highest number: " + highest);
            System.out.println("Lowest number: " + lowest);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}