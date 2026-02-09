import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt();

        try {
            // Attempt division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Cannot divide by zero!");
        }

        System.out.println("Program continues running...");
        sc.close();
    }
}
