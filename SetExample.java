import java.util.Set;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        Set<String> fruits = new HashSet<>();

        // Add five elements to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");

        // Print the set
        System.out.println("Fruits in the set: " + fruits);
    }
}
