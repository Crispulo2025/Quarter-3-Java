import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {

    public static void main(String[] args) {
        String fileName = "output.txt"; // File to create

        try {
            File file = new File(fileName);

            // Check if file already exists
            if (file.createNewFile()) {
                System.out.println("File '" + fileName + "' has been created successfully.");
            } else {
                System.out.println("File '" + fileName + "' already exists.");
            }

            // Optional: write some content to the file
            try (FileWriter fw = new FileWriter(file)) {
                fw.write("This is a sample text inside output.txt.\n");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
