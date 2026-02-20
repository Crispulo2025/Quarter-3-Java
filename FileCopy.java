import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {
        String sourcePath = "source.txt";  // Source file path
        String destinationPath = "backup/source_copy.txt"; // Destination path

        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);

        // Ensure the destination directory exists
        destinationFile.getParentFile().mkdirs();

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int length;

            // Read and write chunks of data
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            System.out.println("File copied successfully to: " + destinationPath);

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}