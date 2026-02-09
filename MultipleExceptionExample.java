import java.util.Scanner;

public class MultipleExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize a String to demonstrate NullPointerException
        String text = null;

        try {
            // Ask user for two numbers
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            // This may throw ArithmeticException if num2 is 0
            int result = num1 / num2;
            System.out.println("Division result: " + result);

            // This will throw NullPointerException since text is null
            System.out.println("Length of the text: " + text.length());

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");

        } catch (NullPointerException e) {
            System.out.println("Error: Tried to access a null object!");

        } finally {
            System.out.println("Program execution finished.");
            sc.close();
        }
    }
}
