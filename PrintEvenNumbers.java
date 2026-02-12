import java.util.ArrayList;

public class PrintEvenNumbers {
    public static void main(String[] args) {

        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(33);
        numbers.add(42);
        numbers.add(7);

        // Enhanced for-each loop to print even numbers
        System.out.println("Even numbers in the ArrayList:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
