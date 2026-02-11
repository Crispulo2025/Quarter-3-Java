import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class RemoveDuplicates {

    // Method to remove duplicates from a List<Integer>
    public static List<Integer> removeDuplicates(List<Integer> list) {
        // Create a Set from the list (automatically removes duplicates)
        Set<Integer> set = new HashSet<>(list);

        // Convert the Set back to a List
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        System.out.println("Original list: " + numbers);

        List<Integer> noDuplicates = removeDuplicates(numbers);
        System.out.println("List without duplicates: " + noDuplicates);
    }
}
