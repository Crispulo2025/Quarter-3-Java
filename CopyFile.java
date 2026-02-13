import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {
        String sourceFile = "source.txt";  // File to read from
        String destFile = "destination.txt"; // File to write to

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            int b;
            // Read byte by byte
            while ((b = fis.read()) != -1) {
                fos.write(b); // Write byte to destination
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
