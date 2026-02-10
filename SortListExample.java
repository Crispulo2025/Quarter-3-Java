import java.util.*;

public class SortListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grape");

        // Sort the list in alphabetical order
        Collections.sort(fruits);

        // Display the sorted list
        System.out.println("Sorted list: " + fruits);
    }
}
