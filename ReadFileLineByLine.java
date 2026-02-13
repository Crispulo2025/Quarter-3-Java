import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {
        String fileName = "sample.txt"; // File to read

        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
