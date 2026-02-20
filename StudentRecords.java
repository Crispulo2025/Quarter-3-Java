import java.io.*;
import java.util.Scanner;

public class StudentRecords {

    static String fileName = "students.txt"; // File to store student data

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Records Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudent(input);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        input.close();
    }

    // Method to add a student to the file
    public static void addStudent(Scanner input) {
        try (FileWriter fw = new FileWriter(fileName, true);  // append mode
             PrintWriter pw = new PrintWriter(fw)) {

            System.out.print("Enter Student ID: ");
            String id = input.nextLine();

            System.out.print("Enter Student Name: ");
            String name = input.nextLine();

            System.out.print("Enter Student Grade: ");
            String grade = input.nextLine();

            // Save as CSV: ID,Name,Grade
            pw.println(id + "," + name + "," + grade);
            System.out.println("Student record saved successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to view all students
    public static void viewStudents() {
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n--- Student Records ---");

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 3) {
                    System.out.println("ID: " + parts[0] +
                                       ", Name: " + parts[1] +
                                       ", Grade: " + parts[2]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}