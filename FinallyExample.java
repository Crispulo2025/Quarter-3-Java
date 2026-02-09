import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Ask user for two numbers
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();

            // This may throw ArithmeticException if denominator is 0
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");

        } finally {
            // This block always executes
            System.out.println("This message is displayed no matter what!");
            sc.close();
        }
    }
}
