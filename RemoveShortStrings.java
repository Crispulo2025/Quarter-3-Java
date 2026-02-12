import java.util.ArrayList;
import java.util.Iterator;

public class RemoveShortStrings {
    public static void main(String[] args) {
        // Create an ArrayList and add some strings
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");
        words.add("Programming");
        words.add("AI");
        words.add("Machine");

        // Create an iterator
        Iterator<String> iterator = words.iterator();

        // Iterate and remove strings shorter than 5 characters
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.length() < 5) {
                iterator.remove();
            }
        }

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + words);
    }
}
