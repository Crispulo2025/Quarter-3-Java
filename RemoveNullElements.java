import java.util.ArrayList;
import java.util.Iterator;

public class RemoveNullElements {
    public static void main(String[] args) {
        // Create an ArrayList with some null elements
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add(null);
        names.add("Bob");
        names.add(null);
        names.add("Charlie");

        System.out.println("Original List: " + names);

        // Using Iterator to remove null elements safely
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name == null) {
                iterator.remove(); // Remove null element
            }
        }

        // Print the modified list
        System.out.println("List after removing nulls: " + names);
    }
}
