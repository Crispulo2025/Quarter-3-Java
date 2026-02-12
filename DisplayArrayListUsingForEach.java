import java.util.ArrayList;
import java.util.List;

public class DisplayArrayListUsingForEach {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        
        // Using Java 8 forEach() method with lambda expression
        System.out.println("Displaying all elements using forEach():");
        fruits.forEach(fruit -> System.out.println(fruit));
        
        // Optional: Using method reference (even shorter)
        System.out.println("\nDisplaying all elements using method reference:");
        fruits.forEach(System.out::println);
    }
}
