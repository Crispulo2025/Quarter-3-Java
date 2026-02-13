import java.io.FileWriter;
import java.io.IOException;

public class WriteParagraph {

    public static void main(String[] args) {
        String fileName = "output.txt"; // File to write to
        String paragraph = "Java is a versatile programming language. "
                         + "It allows developers to create applications ranging from desktop to web and mobile. "
                         + "Learning Java opens many opportunities in software development.";

        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(paragraph); // Write paragraph to the file
            System.out.println("Paragraph successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
