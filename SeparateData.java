import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class SeparateData {

    public static void main(String[] args) {

        String inputFile = "input.txt";
        String numberFile = "numbers.txt";
        String textFile = "text.txt";

        try (
            Scanner fileScanner = new Scanner(new File(inputFile));
            PrintWriter numberWriter = new PrintWriter(numberFile);
            PrintWriter textWriter = new PrintWriter(textFile);
        ) {

            while (fileScanner.hasNext()) {

                if (fileScanner.hasNextDouble()) {
                    double number = fileScanner.nextDouble();
                    numberWriter.println(number);
                } else {
                    String text = fileScanner.next();
                    textWriter.println(text);
                }
            }

            System.out.println("Data successfully separated.");
            System.out.println("Numbers written to: " + numberFile);
            System.out.println("Text written to: " + textFile);

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}