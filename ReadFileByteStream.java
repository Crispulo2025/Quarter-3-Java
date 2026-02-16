import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileByteStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path of the file to read: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (!file.exists() || !file.isFile()) {
            System.out.println("File does not exist or is not a valid file.");
            scanner.close();
            return;
        }

        try (FileInputStream fis = new FileInputStream(file)) {
            int byteData;

            System.out.println("File contents:");
            while ((byteData = fis.read()) != -1) {
                // Convert byte to char and print
                System.out.print((char) byteData);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
