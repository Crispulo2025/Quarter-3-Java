import java.util.ArrayList;

public class WhileLoopArrayListExample {
    public static void main(String[] args) {

        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        // Use a while loop to iterate through the ArrayList
        int index = 0;

        while (index < names.size()) {
            System.out.println(names.get(index));
            index++;
        }
    }
}
