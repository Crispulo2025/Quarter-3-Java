import java.util.HashSet;

public class SumHashSet {
    public static void main(String[] args) {

        // Create a HashSet of integers
        HashSet<Integer> numbers = new HashSet<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Initialize sum
        int sum = 0;

        // Iterate using for-each loop
        for (int num : numbers) {
            sum += num;
        }

        // Display the sum
        System.out.println("Sum of all elements: " + sum);
    }
}
