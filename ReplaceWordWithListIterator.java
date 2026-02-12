import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReplaceWordWithListIterator {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("cherry");
        words.add("apple");
        
        // Word to be replaced and replacement word
        String targetWord = "apple";
        String replacementWord = "orange";
        
        // Using ListIterator to replace occurrences
        ListIterator<String> iterator = words.listIterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            if (current.equals(targetWord)) {
                iterator.set(replacementWord); // Replace the current element
            }
        }
        
        // Print the modified list
        System.out.println("Modified List: " + words);
    }
}
