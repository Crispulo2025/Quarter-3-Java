import java.util.List;

public class ListUtils {

    // Method to find the maximum integer in a list
    public static int findMax(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("The list cannot be null or empty.");
        }

        int max = numbers.get(0); // Assume first element is maximum
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Example usage
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 25, 7, 42, 18);
        int maxValue = findMax(numbers);
        System.out.println("Maximum value: " + maxValue); // Output: 42
    }
}
