import java.io.*;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String filename = "data.txt";

        // Data to write
        String[] data = {"Hello, world!", "Java file I/O example.", "Store and retrieve data."};

        // Writing data to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Data has been written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }

        // Reading data from the file
        System.out.println("\nReading data from " + filename + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
