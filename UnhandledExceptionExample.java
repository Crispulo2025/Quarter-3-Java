import java.util.Scanner;

public class UnhandledExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt();

        // No try-catch block here
        int result = numerator / denominator; // This will throw ArithmeticException if denominator is 0
        System.out.println("Result: " + result);

        sc.close();
    }
}
