import java.util.Scanner;

public class NumberFormatExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = sc.nextLine(); // Read input as a string

        try {
            // Attempt to convert the string to an integer
            int number = Integer.parseInt(input);
            System.out.println("You entered the number: " + number);

        } catch (NumberFormatException e) {
            // Handle invalid input
            System.out.println("Error: Invalid number format! Please enter digits only.");

        } finally {
            System.out.println("Program execution finished.");
            sc.close();
        }
    }
}
