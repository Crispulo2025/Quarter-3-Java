import java.io.*;
import java.util.Scanner;

public class LoginAttempts {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fileName = "login_attempts.txt";

        try {
            // Ask user for login details
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Store login attempt in file (append mode)
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write("Username: " + username + ", Password: " + password);
            writer.newLine();
            writer.close();

            // Count total attempts
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int count = 0;

            while (reader.readLine() != null) {
                count++;
            }
            reader.close();

            System.out.println("Login attempt recorded.");
            System.out.println("Total login attempts: " + count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
