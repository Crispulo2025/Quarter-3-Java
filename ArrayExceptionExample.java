import java.util.Scanner;

public class ArrayExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of 5 integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Ask the user for an index
        System.out.print("Enter an index (0-4) to access the array: ");
        int index = sc.nextInt();

        try {
            // Attempt to access the array element
            int value = numbers[index];
            System.out.println("Value at index " + index + " is " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle invalid index
            System.out.println("Error: Invalid index! Please enter a number between 0 and " + (numbers.length - 1));
        }

        sc.close();
    }
}
