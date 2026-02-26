import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionDemo {

    public static void main(String[] args) {
        String fileName = "sample.txt";  // File that may or may not exist

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            System.out.println("Reading file contents:\n");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
        } finally {
            System.out.println("\nProgram execution completed.");
        }
    }
}