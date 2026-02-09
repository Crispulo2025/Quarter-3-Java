import java.util.Scanner;

public class UserFriendlyException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Ask the user for two numbers
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();

            // This may throw ArithmeticException if denominator is 0
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Print a friendly message instead of the system error
            System.out.println("Oops! You cannot divide by zero. Please try again.");

        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.out.println("An unexpected error occurred. Please enter valid input.");

        } finally {
            System.out.println("Thank you for using the program!");
            sc.close();
        }
    }
}
