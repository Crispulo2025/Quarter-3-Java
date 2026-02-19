import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramLogger {

    public static void main(String[] args) {

        // Log file name
        String fileName = "program_log.txt";

        // Get current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // Message to log
        String message = "Program executed successfully.";

        try (FileWriter fw = new FileWriter(fileName, true);  // true = append mode
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println("Date & Time: " + formattedDateTime);
            pw.println("Message: " + message);
            pw.println("-----------------------------------");

            System.out.println("Log entry recorded successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the log file.");
            e.printStackTrace();
        }
    }
}