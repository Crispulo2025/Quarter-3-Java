import java.util.ArrayList;
import java.util.List;

public class CountNumbersGreaterThan100 {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(150);
        numbers.add(200);
        numbers.add(80);
        numbers.add(120);
        
        // Counter for numbers greater than 100
        int count = 0;
        
        // Using a for-each loop
        for (int num : numbers) {
            if (num > 100) {
                count++;
            }
        }
        
        // Print the result
        System.out.println("Number of elements greater than 100: " + count);
    }
}
