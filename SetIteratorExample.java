import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratorExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Obtain an iterator
        Iterator<String> iterator = fruits.iterator();

        // Iterate through the set
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
