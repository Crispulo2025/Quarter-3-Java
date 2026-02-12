import java.util.Vector;

public class FindLargestInVector {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(45);
        numbers.add(120);
        numbers.add(75);
        numbers.add(200);
        numbers.add(90);

        // Initialize largest with the first element
        int largest = numbers.get(0);

        // Enhanced for loop to find the largest value
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }

        // Print the largest value
        System.out.println("The largest value in the Vector is: " + largest);
    }
}
