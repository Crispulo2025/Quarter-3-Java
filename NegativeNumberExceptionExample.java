import java.util.Scanner;

public class NegativeNumberExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {
            // Check if the number is negative
            if (number < 0) {
                throw new Exception("Negative numbers are not allowed!");
            }
            System.out.println("You entered: " + number);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program execution finished.");
            sc.close();
        }
    }
}
