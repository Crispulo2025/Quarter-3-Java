import java.io.File;
import java.io.IOException;

public class CreateFileProgram {
    public static void main(String[] args) {
        File file = new File("output.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File 'output.txt' created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
