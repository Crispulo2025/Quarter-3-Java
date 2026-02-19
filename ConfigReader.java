import java.io.*;
import java.util.*;

public class ConfigReader {
    public static void main(String[] args) {
        String filePath = "config.txt"; // replace with your config file path
        Properties config = new Properties();

        try (FileInputStream fis = new FileInputStream(filePath)) {
            // Load the key-value pairs from the file
            config.load(fis);

            System.out.println("Configuration Key-Value Pairs:");
            for (String key : config.stringPropertyNames()) {
                String value = config.getProperty(key);
                System.out.println(key + ": " + value);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Configuration file not found.");
        } catch (IOException e) {
            System.out.println("Error reading configuration file.");
        }
    }
}
