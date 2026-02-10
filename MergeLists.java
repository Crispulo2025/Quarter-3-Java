import java.util.*;

public class MergeLists {
    
    // Method to merge two lists without duplicates
    public static List<String> mergeLists(List<String> list1, List<String> list2) {
        // Use a LinkedHashSet to maintain order and remove duplicates
        Set<String> mergedSet = new LinkedHashSet<>();
        mergedSet.addAll(list1);
        mergedSet.addAll(list2);

        // Convert back to a List
        return new ArrayList<>(mergedSet);
    }

    public static void main(String[] args) {
        List<String> listA = Arrays.asList("Apple", "Banana", "Orange");
        List<String> listB = Arrays.asList("Banana", "Kiwi", "Apple", "Mango");

        List<String> mergedList = mergeLists(listA, listB);

        System.out.println("Merged List: " + mergedList);
    }
}
