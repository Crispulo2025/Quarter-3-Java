import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvenLinesWriter {

    public static void main(String[] args) {

        try {
            File inputFile = new File("input.txt");
            Scanner scanner = new Scanner(inputFile);

            PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));

            int lineNumber = 1;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (lineNumber % 2 == 0) {
                    writer.println(line);
                }

                lineNumber++;
            }

            scanner.close();
            writer.close();

            System.out.println("Even-numbered lines written to output.txt successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        } catch (IOException e) {
            System.out.println("Error writing to output file.");
        }
    }
}