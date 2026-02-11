import java.util.ArrayList;
import java.util.Iterator;

public class IteratorVsForLoop {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        System.out.println(); // Empty line for separation

        // Using an enhanced for loop
        System.out.println("Iterating using enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
